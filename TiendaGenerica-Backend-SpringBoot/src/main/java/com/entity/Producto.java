package com.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "codigo_producto", nullable = false, unique = true)
    private Long codigo_producto;

    @Column(name = "nombre_producto", nullable = false, length = 100)
    private String nombre_producto;

    @Column(name = "precio_venta", nullable = false, precision = 15, scale = 2)
    private BigDecimal precio_venta;

    @Column(name = "iva", nullable = false, precision = 5, scale = 2)
    private BigDecimal iva;

    @Column(name = "stock")
    private Integer stock = 0;

    @Column(name = "activo")
    private Boolean activo = true;
}