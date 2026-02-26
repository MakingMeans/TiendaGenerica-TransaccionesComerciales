package com.tienda.service;

import com.tienda.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface VentaService {

    List<Venta> findAll();

    Optional<Venta> findById(Long id);

    Venta save(Venta venta);

    Venta update(Long id, Venta venta);

    void delete(Long id);
}