import { Link, replace, useNavigate } from "react-router-dom";
import './Navbar.css'

export default function Navbar() {
  const navigate = useNavigate()
  const handleLogout = () => {
    alert("LOGOUT")
    localStorage.removeItem("isAuthenticated");
    setIsAuthenticated("false");
    navigate("/login");
  }
  return (
    <nav className="navbar" style={{ marginBottom: "20px" }}>
      <Link className="nav-link" to="/dashboard" style={{ margin: "0 10px" }}>Dashboard</Link>
      <Link className="nav-link" to="/login" style={{ margin: "0 10px" }}>Login</Link>
      <Link className="nav-link" to="/feature" style={{ margin: "0 10px" }}>Features</Link>
      {/* <button onClick={handleLogout}>Logout</button> */}

    </nav>
  );
}