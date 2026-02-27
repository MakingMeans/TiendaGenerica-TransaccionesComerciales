package com.tienda.service.impl;

import com.tienda.entity.Usuario;
import com.tienda.repository.UsuarioRepository;
import com.tienda.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> findAll() { return repository.findAll(); }

    public Optional<Usuario> findById(Long id) { return repository.findById(id); }

    public Usuario save(Usuario usuario) { return repository.save(usuario); }

    /*public Usuario update(Long id, Usuario usuario) {
        return repository.findById(id)
                .map(db -> {
                    usuario.setIdUsuario(id);
                    return repository.save(usuario);
                })
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }*/
    
    @Override
    public Usuario update(Long id, Usuario usuario) {

        if (!repository.existsById(id)) {
            throw new RuntimeException("Usuario no encontrado");
        }

        return repository.save(usuario);
    }

    public void delete(Long id) { repository.deleteById(id); }
}