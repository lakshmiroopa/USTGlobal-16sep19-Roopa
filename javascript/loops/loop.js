var brands=["kingfisher","aqua","bisleri","kinley"]
console.log("For of loop")
for(var element of brands)
{
    console.log("brand:" +element);
}
console.log("---------------------------------")
var brands=["kingfisher","aqua","bisleri","kinley"]
console.log("For in loop")
for(var index in brands)
{
    console.log("brand:" +brands[index]);
}
console.log("---------------------------------")
var brands=["kingfisher","aqua","bisleri","kinley"]
console.log("For in loop")
for(var index in brands)
{
    console.log("brand:" +index);
}
console.log("---------------------------------")
console.log("For in loop")
var person={
    name:"roopa",
    age:19,
    color:"white"

}
for(var key in person){
    console.log('value=',key);
}
console.log("-----------------------------------")
console.log("ForEach method")
var movies=["arjun reddy","dear comrade","life is beautiful"];
movies.forEach(function(value,index){
    console.log("movie:"+value);
    console.log("index:"+index)
})
console.log("----------------------------------")
console.log("forEach method of arrays");
var items=[
  {
    item:"bangles",
    id:1,
    price:100,
  },
  {
    item:"eyeliner",
    id:2,
    price:500,
  },
  {
    item:"watch",
    id:3,
    price:5000,
  },
  {
    item:"bike",
    id:4,
    price:100000,
  }, 
]
items.forEach(function(item,index){
    console.log("item:",item);
    console.log("index of item:",index);
})
