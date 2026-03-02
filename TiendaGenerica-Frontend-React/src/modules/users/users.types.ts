export interface User {
  id_usuario: number;
  cedula: string;
  nombre: string;
  apellido: string;
  correo: string;
  username: string;
  password: string;
  activo: boolean;
  fecha_creacion: string;
}

export type CreateUserDTO = Omit<
  User,
  'id_usuario' | 'fecha_creacion'
>;