package com.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findByCodigoProducto(Long codigoProducto);

    boolean existsByCodigoProducto(Long codigoProducto);
}