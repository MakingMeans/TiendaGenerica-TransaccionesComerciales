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
    private Long idVenta;

    @Column(name = "codigo_venta", nullable = false, unique = true)
    private Long codigoVenta;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "total_venta", nullable = false, precision = 15, scale = 2)
    private BigDecimal totalVenta;

    @Column(name = "total_iva", nullable = false, precision = 15, scale = 2)
    private BigDecimal totalIva;

    @Column(name = "total_con_iva", nullable = false, precision = 15, scale = 2)
    private BigDecimal totalConIva;

    @Column(name = "fecha_venta")
    private LocalDateTime fechaVenta;
}