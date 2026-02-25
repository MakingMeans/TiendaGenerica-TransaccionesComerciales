package com.dto;

import lombok.Data;

@Data
public class ClienteDTO {

    private Long idCliente;
    private String cedulaCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private String telefono;
    private String emailCliente;
}