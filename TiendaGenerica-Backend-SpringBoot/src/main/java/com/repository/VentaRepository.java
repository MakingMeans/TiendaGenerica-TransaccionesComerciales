package com.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {

    Optional<Venta> findByCodigoVenta(Long codigoVenta);

    List<Venta> findByIdCliente(Long idCliente);

    List<Venta> findByIdUsuario(Long idUsuario);
}