
// How memory managment use in JavaScript 

// 2 Types of memories
/* 
 1  stact (Primitive Data type) 
 2 Heap (Nan Primitive Data type)  use references

*/


let myYoutubeName ="Master Point"

let anothername = myYoutubeName

anothername = "Chai aur code"
console.log(myYoutubeName);
console.log(anothername)

let userOne = {
    email : "arjun@gmail.com",
    upi : "sbi@ybl"
}
let userTwo = userOne
userTwo.email = "Hitesh@gmail.com"
console.log("UserOne = " + userOne.email);
console.log("UserTwo = " + userTwo.email);
