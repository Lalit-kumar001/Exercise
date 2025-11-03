var arr = [1,2,3,4,5];

var arrayDiv = document.getElementById("arrayDisplay");
var submitBtn = document.getElementById("submit");
var resultDisplay = document.getElementById("result");
arrayDiv.innerHTML=arr;

submitBtn.addEventListener("click",()=>{
var NumberValue =  document.getElementById("number").value ;
    var index=-1;
    for(var i=0 ; i< arr.length ;i++){
        if(arr[i]==NumberValue){
            index=i;
            break;
        }
    }
    if(index==-1){
        resultDisplay.innerHTML="Element Not Found";
    }
    else{
        resultDisplay.innerHTML=index;
    }
})