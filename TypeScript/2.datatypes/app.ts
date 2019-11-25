let myName:string="roopa";
console.log(myName, typeof myName); 

let age : number;
console.log(age, typeof age);

let mobileNum : 6305518882;
console.log(age, typeof mobileNum);

let address;
address = "roopa";
address = 9782;
console.log(address, typeof address);

let calAge = function() : void{
    console.log("age is 20");
}
calAge();


class Person{
    constructor(public name : string, public age: number){

    }
}
let person1=new Person("roopa", 19);
console.log(person1);


class Student extends Person{
    constructor(name :string, age : number, public rollNo : number){
        super(name,age);
    }
}
let Student1=new Student("roopa", 20, 44);
console.log(Student1);