package com.DTO.TiendaVirtualSB;

public class Ventas {

	private String codigo_producto;
	private int cantidad;
	private String NIT_cliente;
	public String getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNIT_cliente() {
		return NIT_cliente;
	}
	public void setNIT_cliente(String nIT_cliente) {
		NIT_cliente = nIT_cliente;
	}
	public Ventas(String codigo_producto, int cantidad, String nIT_cliente) {
		super();
		this.codigo_producto = codigo_producto;
		this.cantidad = cantidad;
		NIT_cliente = nIT_cliente;
	}
	
	
	
	
}
