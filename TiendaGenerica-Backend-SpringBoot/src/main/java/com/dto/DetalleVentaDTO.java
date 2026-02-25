package com.dto;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class DetalleVentaDTO {

    private Long idDetalle;
    private Long idVenta;
    private Long idProducto;
    private Integer cantidad;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;
}