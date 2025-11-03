var arr = ["orange", "apple", "banana"];
var divElem = document.getElementById("arrayDisplay");
var addBtn = document.getElementById("add");

divElem.innerHTML = arr;

addBtn.addEventListener("click", () => {
    var indexValue = document.getElementById("index").value;
    var element = document.getElementById("element").value.trim();
    arr.splice(indexValue, 0, element);
    divElem.innerHTML = arr;
});

