import type { LoginRequest, LoginResponse } from './auth.types';

export const login = async (
  credentials: LoginRequest
): Promise<LoginResponse> => {

  // Simulación temporal
  if (credentials.username === 'admin' && credentials.password === '123456') {
    return { token: 'fake-jwt-token' };
  }

  throw new Error('Credenciales inválidas');
};