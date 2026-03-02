import type { User, CreateUserDTO } from './users.types';

let users: User[] = [
  {
    id_usuario: 1,
    cedula: '123456',
    nombre: 'Admin',
    apellido: 'Principal',
    correo: 'admin@test.com',
    username: 'admin',
    password: '1234',
    activo: true,
    fecha_creacion: new Date().toISOString(),
  },
];

export const updateUser = async (
  id: number,
  updatedData: Partial<User>
): Promise<void> => {
  users = users.map((user) =>
    user.id_usuario === id
      ? { ...user, ...updatedData }
      : user
  );
};

export const deleteUser = async (id: number): Promise<void> => {
  users = users.filter((user) => user.id_usuario !== id);
};

export const getUsers = async (): Promise<User[]> => users;

export const createUser = async (
  data: CreateUserDTO
): Promise<void> => {
  const newUser: User = {
    id_usuario: users.length + 1,
    ...data,
    fecha_creacion: new Date().toISOString(),
  };

  users.push(newUser);
};

