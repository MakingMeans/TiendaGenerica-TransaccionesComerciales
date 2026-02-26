package com.tienda.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleVentaDTO {

    private Long id_detalle;

    @NotNull
    private Long id_venta;

    @NotNull
    private Long id_producto;

    @NotNull
    private Integer cantidad;

    @NotNull
    private BigDecimal valor_unitario;

    @NotNull
    private BigDecimal valor_total;
}