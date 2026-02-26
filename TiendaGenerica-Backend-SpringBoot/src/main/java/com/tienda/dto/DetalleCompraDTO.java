package com.tienda.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalleCompraDTO {

    private Long id;

    @NotNull
    private Long idCompra;

    @NotNull
    private Long idProducto;

    @NotNull
    private Integer cantidad;

    @NotNull
    private BigDecimal precioUnitario;
}