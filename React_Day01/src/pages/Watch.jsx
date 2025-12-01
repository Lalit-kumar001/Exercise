import { useEffect, useState } from "react";
import "./Watch.css";

export default function Watch() {
  const [now, setNow] = useState(new Date());

  useEffect(() => {
    const id = setInterval(() => setNow(new Date()), 1000);
    return () => clearInterval(id);
  }, []);

  const two = (n) => {
    if(n<10){
      return String("0"+n);
    }
    else{
      return String(n);
    }
      // return String(n);

  }

  return (
    <div className="watch-container">
      <h1 className="watch-title">Digital Watch</h1>

      <div className="watch-box">
        {two(now.getHours())}:{two(now.getMinutes())}:{two(now.getSeconds())}
      </div>
    </div>
  );
}
