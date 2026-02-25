package com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.DetalleCompra;

public interface DetalleCompraRepository extends JpaRepository<DetalleCompra, Long> {

    List<DetalleCompra> findByCompraIdCompra(Long idCompra);

}