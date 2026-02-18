package com.DAO.TiendaVirtualSB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.DTO.TiendaVirtualSB.ClienteVO;
/**
 * Clase que permite el acceso a la base de datos
 * 
 *
 */
public class ClienteDAO 
{
 /**
  * Permite registrar un Cliente nuevo
  * @param persona
  */	
 public void registrarCliente(ClienteVO cli) 
 {
  Conexion conex= new Conexion();
  try {
   Statement estatuto = conex.getConnection().createStatement();
   estatuto.executeUpdate("INSERT INTO clientes (cedula_cli,direccion_cli,email_cli,nombre_cli,telefono_cli) VALUES ('"+cli.getCedula_cli()+"', '"
     +cli.getDireccion_cli()+"', '"+cli.getEmail_cli()+"', '"+cli.getNombre_cli()+"', '"+cli.getTelefono_cli()+"')");
   estatuto.close();
   conex.desconectar();   
  } catch (SQLException e) {
      System.out.println(e.getMessage());
  }
 } 
/**
 * permite consultar el Cliente asociado al documento enviado como parámetro
 * o todos los clientes sino hay parámetro 
 * @param nit 
 * @return
 */
 public ArrayList<ClienteVO> consultarClientes(String nit) {
  ArrayList<ClienteVO> clientes = new ArrayList<ClienteVO>();
  Conexion conex= new Conexion();
  String sql = "SELECT * FROM clientes ";
  if (!nit.equals("null")) {
	sql = sql + "WHERE cedula_cli = '" + nit + "'";
  }
  try {
	Statement consulta = conex.getConnection().createStatement();
    ResultSet res = consulta.executeQuery(sql);   
    while (res.next()){
      ClienteVO cli = new ClienteVO(res.getString("cedula_cli"),res.getString("direccion_cli"),res.getString("email_cli"),
                                    res.getString("nombre_cli"),res.getString("telefono_cli"));
      clientes.add(cli);
    }
    res.close();
    consulta.close();
    conex.desconectar();
  } catch (Exception e) {
	  System.out.println(e.getMessage());
  }
  return clientes;
 }
}