package com.entity;

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
    private Long id_usuario;

    @Column(name = "cedula_usuario", nullable = false, unique = true, length = 20)
    private String cedula_usuario;

    @Column(name = "nombre_usuario", nullable = false, length = 20)
    private String nombre_usuario;

    @Column(name = "apellido_usuario", nullable = false, length = 20)
    private String apellido_usuario;

    @Column(name = "email_usuario", nullable = false, unique = true, length = 50)
    private String email_usuario;

    @Column(name = "username", nullable = false, unique = true, length = 25)
    private String username;

    @Column(name = "password", nullable = false, length = 25)
    private String password;

    @Column(name = "activo")
    private Boolean activo = true;
}