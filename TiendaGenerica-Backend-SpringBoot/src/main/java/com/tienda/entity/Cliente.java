package com.tienda.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id_cliente;

    @Column(name = "cedula_cliente", nullable = false, unique = true, length = 20)
    private String cedula_cliente;

    @Column(name = "nombre_cliente", nullable = false, length = 20)
    private String nombre_cliente;

    @Column(name = "apellido_cliente", nullable = false, length = 20)
    private String apellido_cliente;

    @Column(name = "direccion", length = 150)
    private String direccion;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "email_cliente", length = 50)
    private String email_cliente;
}