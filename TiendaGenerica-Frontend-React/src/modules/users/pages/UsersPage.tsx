import { useState, useEffect } from 'react';

import { Box, Button, Container, Typography } from '@mui/material';

import { getUsers } from '../users.service';

import type { User } from '../users.types';

export default function UsersPage() {
  const [users, setUsers] = useState<User[]>([]);

  useEffect(() => {
    loadUsers();
  }, []);

  const loadUsers = async () => {
    const data = await getUsers();
    setUsers(data);
  };

  return (
    <Container>
      <Typography variant="h4" sx={{ mb: 3 }}>
        Gestión de Usuarios
      </Typography>

      <Button variant="contained" sx={{ mb: 3 }}>
        Nuevo Usuario
      </Button>

      <Box>
        {users.map((user) => (
          <Typography key={user.id_usuario}>
            {user.username} - {user.correo}
          </Typography>
        ))}
      </Box>
    </Container>
  );
}