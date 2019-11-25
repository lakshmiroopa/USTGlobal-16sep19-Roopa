function circumference(r)
    {
        var circ =(2*Math.PI*r);
        console.log("circumference of circle is:",circ);
    }    
circumference(10);
var circum=function(r)
    {
        var circ =(2*Math.PI*r);
        console.log("circumference of circle is:",circ);
    }    
circum(10);
(function circumference(r)
    {
        var circ =(2*Math.PI*r);
        console.log("circumference of circle is:",circ);
    })(10);
var circumference=r=>
    {
        var circ =(2*Math.PI*r);
        console.log("circumference of circle is:",circ);
    }    
circumference(10);