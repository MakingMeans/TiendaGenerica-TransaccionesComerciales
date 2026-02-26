package com.tienda.controller;

import com.tienda.entity.Compra;
import com.tienda.service.CompraService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    private final CompraService service;

    public CompraController(CompraService service) {
        this.service = service;
    }

    @GetMapping
    public List<Compra> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compra> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Compra> save(@Valid @RequestBody Compra compra) {
        return ResponseEntity.ok(service.save(compra));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Compra> update(@PathVariable Long id, @Valid @RequestBody Compra compra) {
        return ResponseEntity.ok(service.update(id, compra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}