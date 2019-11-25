//Named Functions
function add(num1,num2)
{
    console.log("add="+num1+num2);
}
add(278343,54574);
add(10);
//No method overloading.
function add(num1,num2,num3)
{
    console.log("add="+num1+num2+num3);
}
add(2,9);
//Function Expression
var sub = function add(num1,num2)
{
    console.log("sub=",num1-num2);
    return num1-num2;
}
var value=sub(40,20);
console.log("value="+value);
//IIFE functions
console.log("hello");
(function(num1,num2)
{
    console.log("value=",num1*num2);

})(10,20)
//Fat arrow functions
var div1=(num1,num2)=>
{
    console.log("value=",num1/num2);
}
div1(20,10);
var div2=num2=>{
    console.log("value="+num2);
}
div2(10);
var div3=(num1,num2)=>{
    console.log("value="+num1*num2);
}
div3(20,13);
var div4=(num1,num2)=>num1+num2;
var value=add(10,20);

greeting("roopa");
function greeting(msg)
{
    console.log("msg="+msg);
}
greet("roopa")
var greet=function(msg)
{
    console.log("greet=",+msg);
}
greets("roopa")
var greets=(msg)=>{
console.log("Hi "+msg)
}
