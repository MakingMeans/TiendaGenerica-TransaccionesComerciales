package com.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long id_proveedor;

    @Column(name = "nit", nullable = false, unique = true, length = 20)
    private String nit;

    @Column(name = "nombre_proveedor", nullable = false, length = 100)
    private String nombre_proveedor;

    @Column(name = "direccion", length = 150)
    private String direccion;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "ciudad", length = 100)
    private String ciudad;
}