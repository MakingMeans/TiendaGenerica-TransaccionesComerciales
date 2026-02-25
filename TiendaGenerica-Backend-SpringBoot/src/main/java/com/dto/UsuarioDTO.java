package com.dto;

import lombok.*;

@Data
public class UsuarioDTO {

    private Long idUsuario;
    private String cedulaUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String emailUsuario;
    private String username;
    private String password;
    private Boolean activo;
}