package com.tienda.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDTO {

    private Long idVenta;

    @NotNull
    private Long codigoVenta;

    @NotNull
    private Long idCliente;

    @NotNull
    private Long idUsuario;

    @NotNull
    private BigDecimal totalVenta;

    @NotNull
    private BigDecimal totalIva;

    @NotNull
    private BigDecimal totalConIva;

    private LocalDateTime fechaVenta;
}