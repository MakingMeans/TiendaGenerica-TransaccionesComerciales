package com.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class ProductoDTO {

    private Long idProducto;
    private Long codigoProducto;
    private String nombreProducto;
    private BigDecimal precioVenta;
    private BigDecimal iva;
    private Integer stock;
    private Boolean activo;
}