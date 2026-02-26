import { Navigate } from "react-router-dom";

function PrivateRoute({ children }) {
  const isAuth = localStorage.getItem("auth");

  return isAuth ? children : <Navigate to="/" />;
}

export default PrivateRoute;