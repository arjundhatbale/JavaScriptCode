// Conditional statements

let age = 2; 
if(age > 18){
    console.log("Can vote");
}else{
    console.log("Can not vote");
};

let mode = "silver";
let color; 
if(mode === "dark"){
    color = "black";
} else if (mode == "blue"){
    color = "blue";
}else{
    color = " color not found";
}
 
console.log(color);

//  odd or even 

let num = 2; 
if(num % 2 == 0){
    console.log("even");
}else if(num % 2 != 0){
    console.log("odd");
}

// alert("Hello");

//prompt("hello Arjun");

// let name = prompt("hello");

let no = prompt("Enter a no");

if (no % 5 == 0){
    console.log(no , " is a multiple of 5");
}else{
    console.log(no + " is not Multiple of 5");
};
