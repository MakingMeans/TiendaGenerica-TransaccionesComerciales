package com.tienda.service.impl;

import com.tienda.entity.DetalleVenta;
import com.tienda.repository.DetalleVentaRepository;
import com.tienda.service.DetalleVentaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    private final DetalleVentaRepository repository;

    public DetalleVentaServiceImpl(DetalleVentaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DetalleVenta> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public DetalleVenta save(DetalleVenta detalleVenta) {
        return repository.save(detalleVenta);
    }

    /*@Override
    public DetalleVenta update(Long id, DetalleVenta detalleVenta) {
        return repository.findById(id)
                .map(db -> {
                    detalleVenta.setIdDetalle(id);
                    return repository.save(detalleVenta);
                })
                .orElseThrow(() -> new RuntimeException("DetalleVenta no encontrado"));
    }*/
    
    @Override
    public DetalleVenta update(Long id, DetalleVenta detalleVenta) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("DetalleVenta no encontrado");
        }

        return repository.save(detalleVenta);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}