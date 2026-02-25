package com.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class VentaDTO {

    private Long idVenta;
    private Long codigoVenta;
    private Long idCliente;
    private Long idUsuario;
    private BigDecimal totalVenta;
    private BigDecimal totalIva;
    private BigDecimal totalConIva;
    private LocalDateTime fechaVenta;
}