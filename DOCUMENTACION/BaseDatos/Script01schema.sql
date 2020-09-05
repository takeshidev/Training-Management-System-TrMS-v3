-- MySQL Script generated by MySQL Workbench
-- Sat Sep  5 03:38:16 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema TRMS
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `TRMS` ;

-- -----------------------------------------------------
-- Schema TRMS
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `TRMS` DEFAULT CHARACTER SET utf8 ;
USE `TRMS` ;

-- -----------------------------------------------------
-- Table `TRMS`.`personas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRMS`.`personas` ;

CREATE TABLE IF NOT EXISTS `TRMS`.`personas` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `mail` VARCHAR(45) NULL,
  `password` VARCHAR(60) NULL,
  `rol` VARCHAR(10) NULL COMMENT 'rol en la aplicación:\nAdmin\nTeacher\nUser',
  `status` VARCHAR(15) NULL COMMENT 'Activo/Inactivo',
  `nombres` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `equipo` VARCHAR(45) NULL,
  `subequipo` VARCHAR(45) NULL,
  `vinculacion` VARCHAR(45) NULL COMMENT 'Contrato indefinido\nContrato temporal\nAprendiz\nDesvinculado-Outplacement\nInvitado\nSin vinculación definida',
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE INDEX `idusuarios_UNIQUE` (`idusuario` ASC) VISIBLE,
  PRIMARY KEY (`idusuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TRMS`.`capacitaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRMS`.`capacitaciones` ;

CREATE TABLE IF NOT EXISTS `TRMS`.`capacitaciones` (
  `idCapacitacion` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `tema` VARCHAR(45) NULL,
  `fechainicio` DATE NULL,
  `fechatermino` DATE NULL,
  `horas` DECIMAL(5,1) NULL,
  `añopresupuesto` VARCHAR(10) NULL,
  `status` VARCHAR(15) NULL COMMENT 'Pendiente\nAgendado\nEn curso\nFinalizado',
  `modalidad` VARCHAR(15) NULL COMMENT 'e-learning\nblended\npresencial',
  `proveedor` VARCHAR(45) NULL,
  `instructor` VARCHAR(45) NULL,
  `comentarios` VARCHAR(200) NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idCapacitacion`),
  UNIQUE INDEX `idCapacitaciones_UNIQUE` (`idCapacitacion` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TRMS`.`participaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRMS`.`participaciones` ;

CREATE TABLE IF NOT EXISTS `TRMS`.`participaciones` (
  `idCapacitacion` INT NOT NULL,
  `idUsuario` INT NOT NULL,
  `asistencia` DECIMAL(3,2) NULL,
  `calificacion` DECIMAL(3,2) NULL,
  `equipo` VARCHAR(45) NULL,
  `subequipo` VARCHAR(45) NULL,
  `vinculacion` VARCHAR(45) NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idCapacitacion`, `idUsuario`),
  INDEX `fk_participaciones_Capacitaciones_idx` (`idCapacitacion` ASC) VISIBLE,
  INDEX `fk_participaciones_usuarios1_idx` (`idUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_participaciones_Capacitaciones`
    FOREIGN KEY (`idCapacitacion`)
    REFERENCES `TRMS`.`capacitaciones` (`idCapacitacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_participaciones_usuarios1`
    FOREIGN KEY (`idUsuario`)
    REFERENCES `TRMS`.`personas` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TRMS`.`centrocosto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRMS`.`centrocosto` ;

CREATE TABLE IF NOT EXISTS `TRMS`.`centrocosto` (
  `idcentrocosto` VARCHAR(20) NOT NULL,
  `descripcion` VARCHAR(45) NULL,
  `activo` TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`idcentrocosto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `TRMS`.`gastos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `TRMS`.`gastos` ;

CREATE TABLE IF NOT EXISTS `TRMS`.`gastos` (
  `idGasto` INT NOT NULL,
  `idCapacitacion` INT NOT NULL,
  `idcentrocosto` VARCHAR(20) NULL,
  `glosa` VARCHAR(45) NULL,
  `comentario` VARCHAR(45) NULL,
  `monto` DECIMAL(15,2) NULL,
  `tipo` VARCHAR(45) NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idGasto`),
  UNIQUE INDEX `idgastos_UNIQUE` (`idGasto` ASC) VISIBLE,
  INDEX `fk_gastos_Capacitaciones1_idx` (`idCapacitacion` ASC) VISIBLE,
  INDEX `fk_gastos_centrocosto1_idx` (`idcentrocosto` ASC) VISIBLE,
  CONSTRAINT `fk_gastos_Capacitaciones1`
    FOREIGN KEY (`idCapacitacion`)
    REFERENCES `TRMS`.`capacitaciones` (`idCapacitacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_gastos_centrocosto1`
    FOREIGN KEY (`idcentrocosto`)
    REFERENCES `TRMS`.`centrocosto` (`idcentrocosto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
