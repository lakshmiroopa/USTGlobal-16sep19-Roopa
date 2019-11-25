const employees=new Promise(function(resolve,reject){
    if(30<10)
      resolve("success");
    else 
    {
      reject([{
          name:"roopa",
          age:19,
          color:"white",
      },
      {
          name:"pavi",
          age:20,
          color:"white",
      },
      {
          name:"ram",
          age:21,
          color:"white",
      },
])
}
})
employees.then(function(message){
    console.log("Success message", message);
}).catch(function(err){
    console.log("Erroe message:", err);
});
const msg=new Promise(function(resolve,reject){
    if(30>10)
      resolve("success");
    else 
        reject("failed");
})
msg.then(function(message){
    console.log("Success message", message);
}).catch(function(err){
    console.log("Erroe message:", err);
}
);
//closures
function outerFunction(counter){
    function innerFunction(){
        let count;
        count=counter+10;
        return count;
    }
    return innerFunction;
}
let innerFunct=outerFunction(10);
let counter=innerFunct();    
console.log("counter value: ", counter);