package com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.DetalleVenta;

public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {

    List<DetalleVenta> findByVentaIdVenta(Long idVenta);

}