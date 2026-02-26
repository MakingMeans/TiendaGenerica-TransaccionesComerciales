import { Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import PrivateRoute from "./components/PrivateRoute";
import Usuarios from "./pages/Usuarios";
import Clientes from "./pages/Clientes";
import Proveedores from "./pages/Proveedores";
import Ventas from "./pages/Ventas";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Login />} />

      <Route
        path="/dashboard"
        element={
          <PrivateRoute>
            <Dashboard />
          </PrivateRoute>
        }
      />
      <Route
  path="/usuarios"
  element={
    <PrivateRoute>
      <Usuarios />
    </PrivateRoute>
  }
/>
<Route
  path="/clientes"
  element={
    <PrivateRoute>
      <Clientes />
    </PrivateRoute>
  }
/>
<Route
  path="/proveedores"
  element={
    <PrivateRoute>
      <Proveedores />
    </PrivateRoute>
  }
/>
<Route
  path="/ventas"
  element={
    <PrivateRoute>
      <Ventas />
    </PrivateRoute>
  }
/>
    </Routes>
  );
}

export default App;