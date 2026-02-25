package com.dto;

import lombok.Data;

@Data
public class ProveedorDTO {

    private Long idProveedor;
    private String nit;
    private String nombreProveedor;
    private String direccion;
    private String telefono;
    private String ciudad;
}