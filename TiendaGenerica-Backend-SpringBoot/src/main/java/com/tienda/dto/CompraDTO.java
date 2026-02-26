package com.tienda.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {
    private Long idCompra;

    @NotNull
    private Long idProveedor;

    @NotNull
    private Long idUsuario;

    @NotNull
    private BigDecimal totalCompra;

    private LocalDateTime fechaCompra;
}