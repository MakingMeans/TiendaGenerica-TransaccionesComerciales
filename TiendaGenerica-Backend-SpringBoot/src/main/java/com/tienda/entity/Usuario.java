package com.tienda.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "cedula_usuario", nullable = false, unique = true, length = 20)
    private String cedulaUsuario;

    @Column(name = "nombre_usuario", nullable = false, length = 20)
    private String nombreUsuario;

    @Column(name = "apellido_usuario", nullable = false, length = 20)
    private String apellidoUsuario;

    @Column(name = "email_usuario", nullable = false, unique = true, length = 50)
    private String emailUsuario;

    @Column(name = "username", nullable = false, unique = true, length = 25)
    private String username;

    @Column(name = "password", nullable = false, length = 25)
    private String password;

    @Column(name = "activo")
    private Boolean activo = true;
}