package cl.takeshi.TRMS.modelo;

import java.util.Calendar;

public class Participacion {
	private int idCapacitacion;
	private int idUsuario;
	private double asistencia;
	private double calificacion;
	private String equipo;
	private String subequipo;
	private String vinculacion;
	private Calendar create_time;
	private Calendar update_time;
	/**
	 *  Constructor vacio
	 */
	public Participacion() {
		super();
	}
	
	//Getters
	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public double getAsistencia() {
		return asistencia;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public String getEquipo() {
		return equipo;
	}
	public String getSubequipo() {
		return subequipo;
	}
	public String getVinculacion() {
		return vinculacion;
	}
	public Calendar getCreate_time() {
		return create_time;
	}
	public Calendar getUpdate_time() {
		return update_time;
	}
	//Setters
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setAsistencia(double asistencia) {
		this.asistencia = asistencia;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public void setSubequipo(String subequipo) {
		this.subequipo = subequipo;
	}
	public void setVinculacion(String vinculacion) {
		this.vinculacion = vinculacion;
	}
	public void setCreate_time(Calendar create_time) {
		this.create_time = create_time;
	}
	public void setUpdate_time(Calendar update_time) {
		this.update_time = update_time;
	}
	
	
}
