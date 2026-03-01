package com.tienda.authenticationservice.service.impl;

import com.tienda.authenticationservice.dto.*;
import com.tienda.authenticationservice.entity.Usuario;
import com.tienda.authenticationservice.repository.UsuarioRepository;
import com.tienda.authenticationservice.security.JwtUtil;
import com.tienda.authenticationservice.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    @Override
    public LoginResponseDTO login(LoginRequestDTO request) {

        Usuario usuario = repository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!encoder.matches(request.getPassword(), usuario.getPassword())) {
            throw new RuntimeException("Credenciales inválidas");
        }

        String token = jwtUtil.generateToken(usuario.getUsername());

        return new LoginResponseDTO(token);
    }
}