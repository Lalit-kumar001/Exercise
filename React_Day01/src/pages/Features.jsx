import {Outlet,Link} from "react-router-dom";
function Features(){
    return (
        <div>
             <h2>Features Layout Component</h2>
        <Link to="counter" style={{ margin: "0 10px" }}>Counter</Link>
        <Link to="watch" style={{ margin: "0 10px" }}>Watch</Link>

        <Outlet />
        </div>
    )
}
export default Features;