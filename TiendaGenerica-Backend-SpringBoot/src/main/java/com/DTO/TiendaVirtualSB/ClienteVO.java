package com.DTO.TiendaVirtualSB;

public class ClienteVO {
	
	private String cedula_cli;
	private String direccion_cli;
	private String email_cli;
	private String nombre_cli;
	private String telefono_cli;
	
	public ClienteVO(String cedula_cli, String direccion_cli, String email_cli, String nombre_cli, String telefono_cli) {
		this.cedula_cli = cedula_cli;
		this.direccion_cli = direccion_cli;
		this.email_cli = email_cli;
		this.nombre_cli = nombre_cli;
		this.telefono_cli = telefono_cli;
	}

	public String getCedula_cli() {
		return cedula_cli;
	}

	public void setCedula_cli(String cedula_cli) {
		this.cedula_cli = cedula_cli;
	}

	public String getDireccion_cli() {
		return direccion_cli;
	}

	public void setDireccion_cli(String direccion_cli) {
		this.direccion_cli = direccion_cli;
	}

	public String getEmail_cli() {
		return email_cli;
	}

	public void setEmail_cli(String email_cli) {
		this.email_cli = email_cli;
	}

	public String getNombre_cli() {
		return nombre_cli;
	}

	public void setNombre_cli(String nombre_cli) {
		this.nombre_cli = nombre_cli;
	}

	public String getTelefono_cli() {
		return telefono_cli;
	}

	public void setTelefono_cli(String telefono_cli) {
		this.telefono_cli = telefono_cli;
	}	 
}
