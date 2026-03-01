package com.tienda.authenticationservice.service;

import com.tienda.authenticationservice.dto.LoginRequestDTO;
import com.tienda.authenticationservice.dto.LoginResponseDTO;

public interface AuthService {

    LoginResponseDTO login(LoginRequestDTO request);
}