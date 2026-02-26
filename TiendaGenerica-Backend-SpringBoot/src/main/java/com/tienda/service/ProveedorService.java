package com.tienda.service;

import com.tienda.entity.Proveedor;
import java.util.List;
import java.util.Optional;

public interface ProveedorService {

    List<Proveedor> findAll();

    Optional<Proveedor> findById(Long id);

    Proveedor save(Proveedor proveedor);

    Proveedor update(Long id, Proveedor proveedor);

    void delete(Long id);
}