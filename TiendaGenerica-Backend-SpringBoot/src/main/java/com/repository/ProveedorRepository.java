package com.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    Optional<Proveedor> findByNit(String nit);

    boolean existsByNit(String nit);
}