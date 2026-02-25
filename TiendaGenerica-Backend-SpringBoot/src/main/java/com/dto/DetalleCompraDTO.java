package com.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class DetalleCompraDTO {

    private Long id;
    private Long idCompra;
    private Long idProducto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
}