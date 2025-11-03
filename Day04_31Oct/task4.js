const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};

function showPersonInfo(obj) {

const{name,addrss:{city}} = obj;
console.log(`${name} lives in ${city}.`);
 console.log(obj.address);

}

showPersonInfo(obj);