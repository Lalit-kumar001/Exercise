const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]

function extract(arr){

    const [{name},{age}] = data;
     return `${name}'s age is ${age}.`;

     
}
// agar dono chize extract karni ho 

// const [{ name: name1, age: age1 }, { name: name2, age: age2 }] = data;