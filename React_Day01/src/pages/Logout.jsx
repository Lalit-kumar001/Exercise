import { useEffect } from "react"
import { useNavigate } from "react-router-dom";

function Logout({handleLogout,isAuthenticated}){
    const navigate = useNavigate();
    useEffect(()=>{
        if(isAuthenticated){
        handleLogout();
        }
        navigate("/login");
    },[])
    return (
        <>
        <h1>You Are not Login</h1>
        </>
    )
}
export default Logout;