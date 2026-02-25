package com.BO.TiendaVirtualSB;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DAO.TiendaVirtualSB.ClienteDAO;
import com.DAO.TiendaVirtualSB.ProveedorDAO;
import com.DAO.TiendaVirtualSB.VentasDAO;
import com.DTO.TiendaVirtualSB.ClienteVO;
import com.DTO.TiendaVirtualSB.ProveedorVO;
import com.fasterxml.jackson.databind.JsonNode;

@RestController
public class ClienteController {	
	@RequestMapping("/registrarCliente")
	public void registrarCliente(ClienteVO cli) 
	 {
		ClienteDAO Dao=new ClienteDAO(); 
	    Dao.registrarCliente(cli);	    
	 }	 
	/**
	 * permite consultar el Cliente asociado al documento enviado como parámetro
	 * o todos los clientes si no hay parámetro 
	 * @param documento 
	 * @return
	 */	
	@RequestMapping("/consultarClientes")
	public ArrayList<ClienteVO> consultarClientes(String nit) {
		ClienteDAO Dao=new ClienteDAO(); 
	    return 	Dao.consultarClientes(nit);		
	}

	//?NIT=112233&nombre=Gato&direccion=Barranquilla&telefono=314456987&email=gato@hotmail.com&sitioweb=www.elgato.com
	@RequestMapping("/registrarProveedor")
	public String registrarProveedor(ProveedorVO p) {		
		ProveedorDAO dao = new ProveedorDAO();
		dao.insertProveedor(p);
		return "Proveedor Registrado";		
	}
	
	@RequestMapping("/consultarProveedores")
	public ArrayList<ProveedorVO> consultarProveedores(String nit) {		
		ProveedorDAO dao = new ProveedorDAO();
		return dao.consultarProveedores(nit);		
	}
	
	@RequestMapping("/consultarVentas")
	public ArrayList<String> consultarVentas(String tipo) {		
		VentasDAO dao = new VentasDAO();
		return dao.consultarConsolidado(tipo);		
	}
}