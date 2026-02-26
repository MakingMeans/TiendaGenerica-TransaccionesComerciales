package com.tienda.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {

    private Long id_cliente;

    @NotBlank
    @Size(max = 20)
    private String cedula_cliente;

    @NotBlank
    @Size(max = 20)
    private String nombre_cliente;

    @NotBlank
    @Size(max = 20)
    private String apellido_cliente;

    @Size(max = 150)
    private String direccion;

    @Size(max = 15)
    private String telefono;

    @Email
    private String email_cliente;
}