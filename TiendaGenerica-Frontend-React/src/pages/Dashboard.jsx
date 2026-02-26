import Sidebar from "../components/Sidebar";

function Dashboard() {
  return (
    <div style={{ display: "flex" }}>
      <Sidebar />

      <div style={{ padding: "40px", flex: 1 }}>
        <h1>Panel Administrativo</h1>
        <p>Bienvenido al sistema de gestión de la tienda.</p>
      </div>
    </div>
  );
}

export default Dashboard;