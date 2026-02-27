package com.tienda.service.impl;

import com.tienda.entity.DetalleCompra;
import com.tienda.repository.DetalleCompraRepository;
import com.tienda.service.DetalleCompraService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCompraServiceImpl implements DetalleCompraService {

    private final DetalleCompraRepository repository;

    public DetalleCompraServiceImpl(DetalleCompraRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DetalleCompra> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<DetalleCompra> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public DetalleCompra save(DetalleCompra detalleCompra) {
        return repository.save(detalleCompra);
    }

    /*@Override
    public DetalleCompra update(Long id, DetalleCompra detalleCompra) {
        return repository.findById(id)
                .map(db -> {
                    detalleCompra.setId(id);
                    return repository.save(detalleCompra);
                })
                .orElseThrow(() -> new RuntimeException("DetalleCompra no encontrado"));
    }*/
    
    @Override
    public DetalleCompra update(Long id, DetalleCompra detalleCompra) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("DetalleCompra no encontrado");
        }

        return repository.save(detalleCompra);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}