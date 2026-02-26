package com.tienda.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    private Long idCliente;

    @NotBlank
    @Size(max = 20)
    private String cedulaCliente;

    @NotBlank
    @Size(max = 20)
    private String nombreCliente;

    @NotBlank
    @Size(max = 20)
    private String apellidoCliente;

    @Size(max = 150)
    private String direccion;

    @Size(max = 15)
    private String telefono;

    @Email
    private String emailCliente;
}