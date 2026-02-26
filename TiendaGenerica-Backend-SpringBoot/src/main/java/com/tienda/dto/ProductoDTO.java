package com.tienda.dto;

import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {

    private Long idProducto;

    @NotNull
    private Long codigoProducto;

    @NotBlank
    private String nombreProducto;

    @NotNull
    private BigDecimal precioVenta;

    @NotNull
    private BigDecimal iva;

    private Integer stock;

    private Boolean activo;
}