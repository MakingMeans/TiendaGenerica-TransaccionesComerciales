package com.tienda.service.impl;

import com.tienda.entity.Venta;
import com.tienda.repository.VentaRepository;
import com.tienda.service.VentaService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    private final VentaRepository repository;

    public VentaServiceImpl(VentaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Venta> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Venta> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Venta save(Venta venta) {
        return repository.save(venta);
    }

    /*@Override
    public Venta update(Long id, Venta venta) {
        return repository.findById(id)
                .map(db -> {
                    venta.setIdVenta(id);
                    return repository.save(venta);
                })
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));
    }*/
    
    @Override
    public Venta update(Long id, Venta venta) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Venta no encontrado");
        }

        return repository.save(venta);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}