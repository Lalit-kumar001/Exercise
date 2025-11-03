
var arr = ["mango","banana"];
var divElem = document.getElementById('arrayDisplay');

var btn = document.getElementById("add")
divElem.innerHTML=arr;

btn.addEventListener('click',()=>{
    var inputValue = document.getElementById("newElem").value;
arr.push(inputValue);

divElem.innerHTML=arr;

})


