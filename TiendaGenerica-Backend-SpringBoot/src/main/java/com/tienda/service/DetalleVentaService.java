package com.tienda.service;

import com.tienda.entity.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface DetalleVentaService {

    List<DetalleVenta> findAll();

    Optional<DetalleVenta> findById(Long id);

    DetalleVenta save(DetalleVenta detalleVenta);

    DetalleVenta update(Long id, DetalleVenta detalleVenta);

    void delete(Long id);
}