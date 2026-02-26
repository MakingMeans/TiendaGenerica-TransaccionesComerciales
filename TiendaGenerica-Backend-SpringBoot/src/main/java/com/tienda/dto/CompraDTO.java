package com.tienda.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {

    private Long id_compra;

    @NotNull
    private Long id_proveedor;

    @NotNull
    private Long id_usuario;

    @NotNull
    private BigDecimal total_compra;

    private LocalDateTime fecha_compra;
}