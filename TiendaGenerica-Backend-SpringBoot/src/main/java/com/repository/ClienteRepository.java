package com.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> findByCedulaCliente(String cedulaCliente);

    boolean existsByCedulaCliente(String cedulaCliente);
}