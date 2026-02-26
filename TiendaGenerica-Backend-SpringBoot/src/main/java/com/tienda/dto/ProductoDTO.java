package com.tienda.dto;

import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

    private Long id_producto;

    @NotNull
    private Long codigo_producto;

    @NotBlank
    private String nombre_producto;

    @NotNull
    private BigDecimal precio_venta;

    @NotNull
    private BigDecimal iva;

    private Integer stock;

    private Boolean activo;
}