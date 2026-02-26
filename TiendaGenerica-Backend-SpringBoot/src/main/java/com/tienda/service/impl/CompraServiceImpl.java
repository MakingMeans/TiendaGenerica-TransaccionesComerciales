package com.tienda.service.impl;

import com.tienda.entity.Compra;
import com.tienda.repository.CompraRepository;
import com.tienda.service.CompraService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImpl implements CompraService {

    private final CompraRepository repository;

    public CompraServiceImpl(CompraRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Compra> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Compra> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Compra save(Compra compra) {
        return repository.save(compra);
    }

    @Override
    public Compra update(Long id, Compra compra) {
        return repository.findById(id)
                .map(db -> {
                    compra.setId_compra(id);
                    return repository.save(compra);
                })
                .orElseThrow(() -> new RuntimeException("Compra no encontrada"));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}