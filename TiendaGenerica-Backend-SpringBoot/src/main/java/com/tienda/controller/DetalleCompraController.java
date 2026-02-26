package com.tienda.controller;

import com.tienda.entity.DetalleCompra;
import com.tienda.service.DetalleCompraService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-compras")
public class DetalleCompraController {

    private final DetalleCompraService service;

    public DetalleCompraController(DetalleCompraService service) {
        this.service = service;
    }

    @GetMapping
    public List<DetalleCompra> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCompra> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetalleCompra> save(@Valid @RequestBody DetalleCompra detalleCompra) {
        return ResponseEntity.ok(service.save(detalleCompra));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleCompra> update(@PathVariable Long id, @Valid @RequestBody DetalleCompra detalleCompra) {
        return ResponseEntity.ok(service.update(id, detalleCompra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}