package com.tienda.service;

import com.tienda.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface CompraService {

    List<Compra> findAll();

    Optional<Compra> findById(Long id);

    Compra save(Compra compra);

    Compra update(Long id, Compra compra);

    void delete(Long id);
}