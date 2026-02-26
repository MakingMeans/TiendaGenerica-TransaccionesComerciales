import Sidebar from "../components/Sidebar";
import "./Clientes.css";

function Clientes() {
  return (
    <div className="layout">
      <Sidebar />

      <div className="main-content">
        {/* Barra superior */}
        <div className="topbar">
          Tienda Genérica - Proveedores
        </div>

        {/* Formulario */}
        <div className="form-container">

          <div className="form-left">
            <label>NIT</label>
            <input type="number" />

            <label>Nombre Proveedor</label>
            <input type="text" />

            <label>Dirección</label>
            <input type="text" />
          </div>

          <div className="form-right">
            <label>Teléfono</label>
            <input type="text" />

            <label>Ciudad</label>
            <input type="email" />
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

export default Clientes;