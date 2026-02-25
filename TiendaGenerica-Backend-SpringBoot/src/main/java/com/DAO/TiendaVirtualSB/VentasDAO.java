package com.DAO.TiendaVirtualSB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.DTO.TiendaVirtualSB.Ventas;



public class VentasDAO {
	
	
	public void insertVentas(Ventas ven) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO ventas(codigo_producto, cantidad, NIT_cliente) VALUES ('" + ven.getCodigo_producto() + "', " + ven.getCantidad()
					+ ", '" + ven.getNIT_cliente() +"')");
			estatuto.close();
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList <String> consultarConsolidado(String tipo) {
		ArrayList<String> registros = new ArrayList<String>();
		Conexion conex = new Conexion();

		String sql = "";
		if (tipo.trim().equals("producto")) {
			sql = "SELECT codigo_producto AS Item, SUM(cantidad) AS Unidades\r\n"
					+ "FROM ventas\r\n"
					+ "GROUP BY codigo_producto\r\n"
					+ "ORDER BY codigo_producto;";
			
		} else if (tipo.trim().equals("cliente")){
			sql = "SELECT NIT_cliente AS Item, SUM(cantidad) AS Unidades\r\n"
					+ "FROM ventas\r\n"
					+ "GROUP BY NIT_cliente\r\n"
					+ "ORDER BY NIT_cliente;";
		}

		try {
			Statement consulta = conex.getConnection().createStatement();
			ResultSet res = consulta.executeQuery(sql);

			while (res.next()) {
				registros.add(res.getString("Item")+";"+res.getInt("unidades"));

			}
			res.close();
			consulta.close();
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se pudo consultar el Proveedor\n" + e);
		}
		return registros;
	}
}
