function filterEven(arr){
    return arr.filter((num)=>{
    return num%2===0
    });
}

const a=filterEven([1,2,3,4])
console.log(a);