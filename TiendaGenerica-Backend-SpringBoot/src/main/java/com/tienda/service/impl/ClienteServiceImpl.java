package com.tienda.service.impl;

import com.tienda.entity.Cliente;
import com.tienda.repository.ClienteRepository;
import com.tienda.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;

    public ClienteServiceImpl(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        return repository.findById(id)
                .map(db -> {
                    cliente.setIdCliente(id);
                    return repository.save(cliente);
                })
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }
    
    /*
    @Override
    public Cliente update(Long id, Cliente cliente) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Cliente no encontrado");
        }

        return repository.save(cliente);
    }
    */

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}