const person={
               name: "sundara",
               age : 100,
               color : "white",
               address : {
                           city : "kandukur",
                           state : "Andhrapradesh",
                           pincode : 523105,                        
                        },
                hobbies:["coding", "bird watching", "singing"],
}
console.log("Javascript person object:", person);
const jsonObject=JSON.stringify(person);
console.log("JSON person object:",jsonObject);
const javaScriptPersonObject=JSON.parse(jsonObject);
console.log("javascript person object after parse",javaScriptPersonObject); 
localStorage.setItem("email", "rupatanikonda@gmail.com");
const emailId= localStorage.getItem("email");
console.log("EmailId: ",emailId);
localStorage.clear();
