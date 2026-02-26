package com.tienda.controller;

import com.tienda.entity.DetalleVenta;
import com.tienda.service.DetalleVentaService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-ventas")
public class DetalleVentaController {

    private final DetalleVentaService service;

    public DetalleVentaController(DetalleVentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<DetalleVenta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetalleVenta> save(@Valid @RequestBody DetalleVenta detalleVenta) {
        return ResponseEntity.ok(service.save(detalleVenta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleVenta> update(@PathVariable Long id, @Valid @RequestBody DetalleVenta detalleVenta) {
        return ResponseEntity.ok(service.update(id, detalleVenta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}