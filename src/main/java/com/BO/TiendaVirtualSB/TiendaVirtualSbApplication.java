package com.BO.TiendaVirtualSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TiendaVirtualSbApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/TiendaVirtualSB");
		SpringApplication.run(TiendaVirtualSbApplication.class, args);
	}
}
