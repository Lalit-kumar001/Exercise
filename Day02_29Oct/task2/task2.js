var divElem = document.getElementById("Mydiv");
var originalColor = divElem.style.backgroundColor;
var changeColor = "green";
divElem.addEventListener('mouseover',()=>{
    divElem.style.backgroundColor=changeColor;
})

divElem.addEventListener('mouseout',()=>{
    divElem.style.backgroundColor=originalColor;
})