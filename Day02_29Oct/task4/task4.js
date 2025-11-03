
var arr = ["orange","mango","banana"];
var divElem = document.getElementById('arrayDisplay');

var btn = document.getElementById("remove")
divElem.innerHTML=arr;

btn.addEventListener('click',()=>{
    // var inputValue = document.getElementById("newElem").value;
var removed = arr.shift();

divElem.innerHTML=arr;

})


