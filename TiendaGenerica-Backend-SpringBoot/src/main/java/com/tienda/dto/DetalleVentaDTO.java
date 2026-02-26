package com.tienda.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleVentaDTO {

    private Long idDetalle;

    @NotNull
    private Long idVenta;

    @NotNull
    private Long idProducto;

    @NotNull
    private Integer cantidad;

    @NotNull
    private BigDecimal valorUnitario;

    @NotNull
    private BigDecimal valorTotal;
}