const arr1 = []
console.log(typeof arr1) // object
console.log(arr1 instanceof Array) //true

for(let i = 0; i < 10; i++) {
    arr1.push(i);
}

console.log(arr1);
arr1.shift();
console.log(arr1);
