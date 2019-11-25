function factorial(num)
      {
        var fact=1;
        for(var i=1;i<=num;i++)
        {
        fact=fact*i;
        }
        console.log("Factorial of " +num+ " is :"+fact);
      }
factorial(5);
console.log("----------------------------------");
var factorial=function(num)
     {
        var fact=1;
        for(var i=1;i<=num;i++)
        {
        fact=fact*i;
        }
        console.log("Factorial of " +num+ " is :"+fact);
      }
factorial(4);
console.log("----------------------------------");
(function factorial(num)
      {
        var fact=1;
        for(var i=1;i<=num;i++)
        {
        fact=fact*i;
        }
        console.log("Factorial of " +num+ " is :"+fact);
      })(3);
console.log("----------------------------------");
var factorial=(num) => 
      {
          
        var fact=1;
        for(var i=1;i<=num;i++)
        {
        fact=fact*i;
        }
        console.log("Factorial of " +num+ " is :"+fact);
    }
factorial(6);