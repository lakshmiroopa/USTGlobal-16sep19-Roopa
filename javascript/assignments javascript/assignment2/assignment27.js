var a=[10,20,30,40];
function add()
        {
            var sum=0; 
            for(var i=0;i<a.length;i++)
            {
              sum=sum+a[i];
            }
            console.log("sum is : "+sum);
        }
add();
var add=function() 
       {
            var sum=0; 
            for(var i=0;i<a.length;i++)
            {
              sum=sum+a[i];
            }
            console.log("sum is : "+sum);
        }
add();
(function add()
        {
            var sum=0; 
            for(var i=0;i<a.length;i++)
            {
              sum=sum+a[i];
            }
            console.log("sum is : "+sum);
        })();
var add=()=>
        {
            var sum=0; 
            for(var i=0;i<a.length;i++)
            {
              sum=sum+a[i];
            }
            console.log("sum is : "+sum);
        }
add();