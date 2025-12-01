import { useState } from 'react'
import Login from './pages/Login.jsx'
import Dashboard from './pages/Dashboard.jsx'; 
import Protected from './components/Protected.jsx';  
import Navbar from './components/Navbar.jsx'
import Features from './pages/Features.jsx';  
import { Route , Routes, useNavigate } from 'react-router-dom';
import Counter from './pages/Counter.jsx';
import Watch from './pages/Watch.jsx';
import Logout from './pages/Logout.jsx'
 
function App() {
    const navigate = useNavigate();
  const [isAuthenticated,setIsAuthenticated]=useState(()=>{
    return localStorage.getItem("isAuthenticated")==="true" ;
  })

  const handleLogin=()=>{
    setIsAuthenticated("true");
    localStorage.setItem("isAuthenticated","true");
  }

  // const handleLogout=()=>{
  //   localStorage.removeItem("isAuthenticated");
  //   setIsAuthenticated("false");
  //   navigate("/features")
  // }

  return (
  <div style={{textAlign:"center",marginTop:"100px"}  }>
<Navbar/>
<Routes>
<Route path="/dashboard" element={<Protected isAuthenticated={isAuthenticated}>
  <Dashboard/>
</Protected>}/> 

<Route path="/login" element={<Login onLogin={handleLogin} isAuthenticated={isAuthenticated}/>}/>
{/* <Route path="/logout" element={<Logout handleLogout={handleLogout} isAuthenticated={isAuthenticated}/> }/> */}

{/* layout component  */}
<Route path='/feature' element={<Protected isAuthenticated={isAuthenticated}>
  <Features  />
</Protected>}>
<Route path="counter" element ={<Protected isAuthenticated={isAuthenticated}>
  <Counter/>
</Protected>}/>
<Route path="watch" element ={<Protected isAuthenticated={isAuthenticated}>
  <Watch/>
</Protected>}/>
</Route>


<Route path="*" element ={<div><h1>404 Page Not Found</h1></div>}/>
</Routes>
 

  </div>
    
  )
}

export default App
