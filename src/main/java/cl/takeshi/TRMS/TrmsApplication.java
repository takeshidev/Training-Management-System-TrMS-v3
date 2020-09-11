package cl.takeshi.TRMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrmsApplication.class, args);
		System.out.println("\r\n" + 
				" ______         _      _            __  ___                                    __    ____        __          \r\n" + 
				"/_  _________ _(____  (____ ___ _  /  |/  ___ ____ ___ ____ ____ __ _ ___ ___ / /_  / ____ _____/ /____ __ _ \r\n" + 
				" / / / __/ _ `/ / _ \\/ / _ / _ `/ / /|_/ / _ `/ _ / _ `/ _ `/ -_/  ' / -_/ _ / __/ _\\ \\/ // (_-/ __/ -_/  ' \\\r\n" + 
				"/_/ /_/  \\_,_/_/_//_/_/_//_\\_, / /_/  /_/\\_,_/_//_\\_,_/\\_, /\\__/_/_/_\\__/_//_\\__/ /___/\\_, /___\\__/\\__/_/_/_/\r\n" + 
				"                          /___/                       /___/                           /___/   por takeshi.cl       \r\n" +  
				"::Training Management System - Spring REST Backend::");
			
	}

}
