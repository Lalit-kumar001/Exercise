var arr = [1,2,3,4];

// reverse 

console.log(arr);
var i=0;
var j=arr.length -1;

while(i<j){
    //swap
    var temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}

console.log(arr);