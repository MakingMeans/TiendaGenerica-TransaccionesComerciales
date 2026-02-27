package com.tienda.service.impl;

import com.tienda.entity.Producto;
import com.tienda.repository.ProductoRepository;
import com.tienda.service.ProductoService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;

    public ProductoServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    /*@Override
    public Producto update(Long id, Producto producto) {
        return repository.findById(id)
                .map(db -> {
                    producto.setIdProducto(id);
                    return repository.save(producto);
                })
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }*/
    
    @Override
    public Producto update(Long id, Producto producto) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Producto no encontrado");
        }

        return repository.save(producto);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}