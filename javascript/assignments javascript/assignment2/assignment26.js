function prime(num)
       {
           var a=1;
           if(num==0||num==1)
           {
               console.log(num+" is not a prime number");
           }
           for(var i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    console.log(num +" is not a prime number");
                    a=0;
                    break;
                }
            }
            if(a===1)
            {
                console.log(num + " is a prime number");
            }
       } 
prime(10);
var prime=function(num)
       {
           var a=1;
           if(num==0||num==1)
           {
               console.log(num+" is not a prime number");
           }
           for(var i=2;i<=num/2;i++)
           {
               if(num%i==0)
                 a=0;
           }
           if(a===1)
             console.log(num +" is a prime number");
           else
            console.log(num +" is not a prime number");
       }
prime(3);
(function prime(num)
       {
           var a=1;
           if(num==0||num==1)
           {
               console.log(num+" is not a prime number");
           }
           for(var i=2;i<=num/2;i++)
           {
               if(num%i==0)
                 a=0;
           }
           if(a===1)
             console.log(num +" is a prime number");
           else
            console.log(num +" is not a prime number");
       })(9);
var prime=(num)=>
       {
           var a=1;
           if(num==0||num==1)
           {
               console.log(num +" is not a prime number");
           }
           for(var i=2;i<=num/2;i++)
           {
               if(num%i==0)
                 a=0;
           }
           if(a===1)
             console.log(num +" is a prime number");
           else
            console.log(num +" is not a prime number");
       }
prime(15);