const hobbies=['sleeping','cricket','eating','coding','roaming'];
console.log(typeof hobbies);
Array.isArray(hobbies);
console.log(hobbies.includes("roaming"));
console.log(hobbies.includes("speaking"));
console.log(hobbies.push("guitar","volleyball"));
console.log(hobbies.pop());
console.log(hobbies.includes("cricket",3));
console.log(hobbies.includes("cricket",1));
console.log(hobbies.unshift("singing","dancing"));
console.log(hobbies.shift());
console.log(hobbies);
console.log(hobbies.splice(1,2,"Bird watching","PUBG"));
console.log(hobbies);
console.log(hobbies.slice(1,5));
console.log(hobbies.slice(2,4));
console.log(hobbies);
console.log(hobbies.indexOf("cricket"));
console.log(hobbies.indexOf("PUBG"));
console.log(hobbies.join('~~~~~~~'));


console.log("Array of numbers")
console.log("_______________________________________________");
const numbers=[100,200,300,400,500];
const numbers1=[];
for(let i=0;i<numbers.length;i++){
    let num=numbers[i]+50;
    numbers1.push(num);
console.log(num);
}
console.log("Using fat arrow function");
console.log("_______________________________________________");
const number=numbers.map(value=>value+50)
console.log(number);
const numbers2=numbers.filter(value=>value>200);
console.log(numbers2);
