import Sidebar from "../components/Sidebar";
import "./Ventas.css";

function Ventas() {
  return (
    <div className="layout">
      <Sidebar />

      <div className="main-content">
        {/* Barra superior */}
        <div className="topbar">
          Tienda Genérica - Ventas
        </div>

        {/* Sección Cliente */}
        <div className="cliente-section">
          <label>Cédula</label>
          <input type="text" />
          <button className="small-btn">Consultar</button>

          <label>Cliente</label>
          <input type="text" />

          <label className="consec">Consec.</label>
          <input type="text" />
        </div>

        {/* Tabla productos */}
        <div className="productos-section">

          <div className="productos-header">
            <span>Cod. Producto</span>
            <span></span>
            <span style={{marginLeft: "20px"}}>Nombre Producto</span>
            <span style={{marginLeft: "30px"}}>Cant.</span>
            <span style={{marginLeft: "40px"}}>Vlr. Tot</span>
          </div>

          {[1,2,3].map((item) => (
            <div key={item} className="productos-row">
              <input type="text" />
              <button className="small-btn">Consultar</button>
              <input type="text" />
              <input type="text" />
              <input type="text" />
            </div>
          ))}

        </div>

        {/* Totales */}
        <div className="totales-section">
          <div>
            <label>Total Venta</label>
            <input type="text" style={{marginLeft: "20px"}}/>
          </div>

          <div>
            <label>Total IVA</label>
            <input type="text" style={{marginLeft: "20px"}}/>
          </div>

          <div>
            <label>Total con IVA</label>
            <input type="text" style={{marginLeft: "20px"}}/>
          </div>
        </div>

        {/* Botón Confirmar */}
        <div className="confirmar-container">
          <button className="confirm-btn">Confirmar</button>
        </div>

      </div>
    </div>
  );
}

export default Ventas;