package com.tienda.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ventas")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long id_venta;

    @Column(name = "codigo_venta", nullable = false, unique = true)
    private Long codigo_venta;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "total_venta", nullable = false, precision = 15, scale = 2)
    private BigDecimal total_venta;

    @Column(name = "total_iva", nullable = false, precision = 15, scale = 2)
    private BigDecimal total_iva;

    @Column(name = "total_con_iva", nullable = false, precision = 15, scale = 2)
    private BigDecimal total_con_iva;

    @Column(name = "fecha_venta")
    private LocalDateTime fecha_venta;
}