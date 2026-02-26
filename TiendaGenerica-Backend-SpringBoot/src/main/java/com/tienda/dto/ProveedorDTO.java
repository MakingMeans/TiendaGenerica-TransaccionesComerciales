package com.tienda.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProveedorDTO {

    private Long id_proveedor;

    @NotBlank
    @Size(max = 20)
    private String nit;

    @NotBlank
    @Size(max = 100)
    private String nombre_proveedor;

    @Size(max = 150)
    private String direccion;

    @Size(max = 20)
    private String telefono;

    @Size(max = 100)
    private String ciudad;
}