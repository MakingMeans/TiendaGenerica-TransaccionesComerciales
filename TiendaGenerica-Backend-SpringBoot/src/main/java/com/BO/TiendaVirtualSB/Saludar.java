package com.BO.TiendaVirtualSB;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	@RequestMapping("/Saludar")
	public String Saludar() {
		return "Hola Mundo";
	}
}
