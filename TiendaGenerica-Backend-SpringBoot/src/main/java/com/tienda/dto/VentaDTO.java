package com.tienda.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDTO {

    private Long id_venta;

    @NotNull
    private Long codigo_venta;

    @NotNull
    private Long id_cliente;

    @NotNull
    private Long id_usuario;

    @NotNull
    private BigDecimal total_venta;

    @NotNull
    private BigDecimal total_iva;

    @NotNull
    private BigDecimal total_con_iva;

    private LocalDateTime fecha_venta;
}