package com.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class CompraDTO {

    private Long idCompra;
    private Long idProveedor;
    private Long idUsuario;
    private BigDecimal totalCompra;
    private LocalDateTime fechaCompra;
}