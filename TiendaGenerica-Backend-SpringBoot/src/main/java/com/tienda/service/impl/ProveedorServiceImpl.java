package com.tienda.service.impl;

import com.tienda.entity.Proveedor;
import com.tienda.repository.ProveedorRepository;
import com.tienda.service.ProveedorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repository;

    public ProveedorServiceImpl(ProveedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Proveedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Proveedor> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public Proveedor update(Long id, Proveedor proveedor) {
        return repository.findById(id)
                .map(db -> {
                    proveedor.setId_proveedor(id);
                    return repository.save(proveedor);
                })
                .orElseThrow(() -> new RuntimeException("Proveedor no encontrado"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}