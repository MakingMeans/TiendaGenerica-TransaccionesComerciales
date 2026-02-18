package com.DAO.TiendaVirtualSB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.DTO.TiendaVirtualSB.ProveedorVO;;

public class ProveedorDAO {

	public void insertProveedor(ProveedorVO prov) {
		Conexion conex = new Conexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO proveedores(nit_prov, ciudad_prov,direccion_prov,nombre_prov, telefono_prov) VALUES ('" + prov.getNit_prov() + "', '" + prov.getCiudad_prov()
					+ "', '" + prov.getDireccion_prov() + "', '" + prov.getNombre_prov() + "', '" + prov.getTelefono_prov() + "')");
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<ProveedorVO> consultarProveedores(String nit) {
		ArrayList<ProveedorVO> proveedores = new ArrayList<ProveedorVO>();
		Conexion conex = new Conexion();

		String sql = "SELECT * FROM proveedores ";
		if (!nit.equals("null")) {
			sql = sql + "WHERE nit_prov = '" + nit + "'";
		}

		try {
			Statement consulta = conex.getConnection().createStatement();
			ResultSet res = consulta.executeQuery(sql);

			while (res.next()) {
				ProveedorVO prov = new ProveedorVO(res.getString("nit_prov"), res.getString("ciudad_prov"),
						res.getString("direccion_prov"), res.getString("nombre_prov"), res.getString("telefono_prov"));
				proveedores.add(prov);
			}
			res.close();
			consulta.close();
			conex.desconectar();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return proveedores;
	}

}
