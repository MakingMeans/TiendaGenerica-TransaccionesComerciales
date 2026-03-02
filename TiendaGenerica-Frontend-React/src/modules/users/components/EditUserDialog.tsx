import { useState, useEffect } from 'react';

import Dialog from '@mui/material/Dialog';
import Button from '@mui/material/Button';
import Switch from '@mui/material/Switch';
import TextField from '@mui/material/TextField';
import DialogTitle from '@mui/material/DialogTitle';
import DialogContent from '@mui/material/DialogContent';
import DialogActions from '@mui/material/DialogActions';
import FormControlLabel from '@mui/material/FormControlLabel';

import { updateUser } from '../users.service';

import type { User } from '../users.types';

type Props = {
  open: boolean;
  user: User | null;
  onClose: () => void;
  onSuccess: () => void;
};

export function EditUserDialog({ open, user, onClose, onSuccess }: Props) {
  const [nombre, setNombre] = useState('');
  const [apellido, setApellido] = useState('');
  const [correo, setCorreo] = useState('');
  const [username, setUsername] = useState('');
  const [activo, setActivo] = useState(true);

  useEffect(() => {
    if (user) {
      setNombre(user.nombre);
      setApellido(user.apellido);
      setCorreo(user.correo);
      setUsername(user.username);
      setActivo(user.activo);
    }
  }, [user]);

  const handleSubmit = async () => {
    if (!user) return;

    await updateUser(user.id_usuario, {
      nombre,
      apellido,
      correo,
      username,
      activo,
    });

    onSuccess();
    onClose();
  };

  return (
    <Dialog open={open} onClose={onClose} fullWidth maxWidth="sm">
      <DialogTitle>Editar Usuario</DialogTitle>

      <DialogContent sx={{ display: 'flex', flexDirection: 'column', gap: 2, mt: 1 }}>
        <TextField label="Nombre" value={nombre} onChange={(e) => setNombre(e.target.value)} fullWidth />
        <TextField label="Apellido" value={apellido} onChange={(e) => setApellido(e.target.value)} fullWidth />
        <TextField label="Correo" value={correo} onChange={(e) => setCorreo(e.target.value)} fullWidth />
        <TextField label="Username" value={username} onChange={(e) => setUsername(e.target.value)} fullWidth />

        <FormControlLabel
          control={<Switch checked={activo} onChange={(e) => setActivo(e.target.checked)} />}
          label="Activo"
        />
      </DialogContent>

      <DialogActions>
        <Button onClick={onClose}>Cancelar</Button>
        <Button variant="contained" onClick={handleSubmit}>
          Guardar
        </Button>
      </DialogActions>
    </Dialog>
  );
}