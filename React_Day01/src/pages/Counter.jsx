import { useEffect, useState } from "react";
import "./Counter.css";   

function Counter() {
  const [count, setCount] = useState(()=>{
    return Number(localStorage.getItem("counterValue")) || 0;   
  });

  useEffect(()=>{
    localStorage.setItem("counterValue", String(count));    
  },[count]);
 
  const increment = () => {
    setCount((prev)=> prev + 1);
  };

  const decrement = () => {
   setCount((prev)=> prev - 1);
  };

  return (
    <div className="counter-container">
      <h1>Counter page</h1>

      <div className="counter-box">
        <div className="counter-value">{count}</div>

        <div className="btn-group">
          <button className="counter-btn" onClick={increment}>Increment</button>
          <button className="counter-btn" onClick={decrement}>Decrement</button>
        </div>
      </div>
    </div>
  );
}

export default Counter;
