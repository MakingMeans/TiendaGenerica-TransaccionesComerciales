package com.tienda.service;

import com.tienda.entity.DetalleCompra;

import java.util.List;
import java.util.Optional;

public interface DetalleCompraService {

    List<DetalleCompra> findAll();

    Optional<DetalleCompra> findById(Long id);

    DetalleCompra save(DetalleCompra detalleCompra);

    DetalleCompra update(Long id, DetalleCompra detalleCompra);

    void delete(Long id);
}