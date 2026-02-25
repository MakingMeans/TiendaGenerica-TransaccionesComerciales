package com.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {

    List<Compra> findByIdProveedor(Long idProveedor);

    List<Compra> findByIdUsuario(Long idUsuario);
}