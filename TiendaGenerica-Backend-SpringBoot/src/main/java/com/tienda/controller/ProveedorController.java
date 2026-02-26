package com.tienda.controller;

import com.tienda.entity.Proveedor;
import com.tienda.service.ProveedorService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

    private final ProveedorService service;

    public ProveedorController(ProveedorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Proveedor> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Proveedor> save(@Valid @RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(service.save(proveedor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> update(@PathVariable Long id, @Valid @RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(service.update(id, proveedor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}