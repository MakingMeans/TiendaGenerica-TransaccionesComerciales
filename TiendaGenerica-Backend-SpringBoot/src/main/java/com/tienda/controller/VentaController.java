package com.tienda.controller;

import com.tienda.entity.Venta;
import com.tienda.service.VentaService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    private final VentaService service;

    public VentaController(VentaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Venta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Venta> save(@Valid @RequestBody Venta venta) {
        return ResponseEntity.ok(service.save(venta));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> update(@PathVariable Long id, @Valid @RequestBody Venta venta) {
        return ResponseEntity.ok(service.update(id, venta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}