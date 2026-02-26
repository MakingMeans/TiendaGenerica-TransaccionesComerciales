import Sidebar from "../components/Sidebar";
import "./Usuarios.css";

function Usuarios() {
  return (
    <div className="layout">
      <Sidebar />

      <div className="main-content">
        {/* Barra superior */}
        <div className="topbar">
          Tienda Genérica - Usuarios
        </div>

        {/* Formulario */}
        <div className="form-container">
          
          <div className="form-left">
            <label>Cédula</label>
            <input type="text" />

            <label>Nombre Completo</label>
            <input type="text" />

            <label>Correo Electrónico</label>
            <input type="email" />
          </div>

          <div className="form-right">
            <label>Usuario</label>
            <input type="text" />

            <label>Contraseña</label>
            <input type="password" />
          </div>

        </div>

        {/* Botones */}
        <div className="button-group">
          <button>Consultar</button>
          <button>Crear</button>
          <button>Actualizar</button>
          <button>Borrar</button>
        </div>
      </div>
    </div>
  );
}

export default Usuarios;