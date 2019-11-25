function first(){
    setTimeout(function(){
        console.log("First function executing");
    },0)
}
function second(){
    console.log("Second function executing"); 
}
first()
second()
function first(callback){
    setTimeout(function(){
        console.log("First function executing");
        callback();
    },0)
}
function second(){
    console.log("Second function executing"); 
}
first(second);
