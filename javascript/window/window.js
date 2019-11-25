console.log("window object", window);
console.log("This keyword", this);
console.log(this===window);
// window.alert("roopa");
// alert("ram");
// let a=confirm("are u sure you want to delete this");
// console.log("confirm delete", a);
// prompt("enter name","roopa");
// prompt("enter phone number", "6305518882");
// console.log("username", username);
const person={
    firstName: "Alia",
    age: 26,
    lastName:"kapoor",
    getName: function(){
        console.log("this keyword", this)
        return this.firstName+" "+this.lastName;
    
    }
}
    let fullName= person.getName();
    console.log("Full Name", fullName);

