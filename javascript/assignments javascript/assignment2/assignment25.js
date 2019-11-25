function fibonacci(num)
    {
        var a=0,b=1;
        console.log(a);
        console.log(b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(" "+c);
        }
    }
fibonacci(7);
var fib=function(num)
    {
        var a=0,b=1;
        console.log(a);
        console.log(b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(" "+c);
        }
    }
fib(7);
(function(num)
    {
        var a=0,b=1;
        console.log(a);
        console.log(b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(" "+c);
        }
    })(7);
var fib=num=>
    {
        var a=0,b=1;
        console.log(a);
        console.log(b);
        for(var i=2;i<=num;i++)
        {
            var c=a+b;
            a=b;
            b=c;
            console.log(" "+c);
        }
    }
fibonacci(7);