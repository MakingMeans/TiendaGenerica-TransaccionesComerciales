import { Link, useNavigate } from "react-router-dom";
import "./Sidebar.css";

function Sidebar() {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("auth");
    navigate("/");
  };

  return (
    <div className="sidebar">
      <h2 className="logo">Tienda Admin</h2>

      <nav>
        <Link to="/dashboard">Dashboard</Link>
        <Link to="/usuarios">Usuarios</Link>
        <Link to="/clientes">Clientes</Link>
        <Link to="/proveedores">Proveedores</Link>
        <Link to="/ventas">Ventas</Link>
        
      </nav>

      <button className="logout" onClick={handleLogout} style={{ marginBottom: "40px" }}>
        Cerrar sesión
      </button>
    </div>
  );
}

export default Sidebar;