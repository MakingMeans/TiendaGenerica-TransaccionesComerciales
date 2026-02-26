package com.tienda.service;

import com.tienda.entity.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> findAll();

    Optional<Cliente> findById(Long id);

    Cliente save(Cliente cliente);

    Cliente update(Long id, Cliente cliente);

    void delete(Long id);
}