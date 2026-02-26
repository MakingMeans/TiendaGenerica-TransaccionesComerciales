package com.tienda.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

    private Long id_usuario;

    @NotBlank
    private String cedula_usuario;

    @NotBlank
    private String nombre_usuario;

    @NotBlank
    private String apellido_usuario;

    @Email
    private String email_usuario;

    @NotBlank
    @Size(max = 25)
    private String username;

    @NotBlank
    @Size(min = 6)
    private String password;

    private Boolean activo;
}