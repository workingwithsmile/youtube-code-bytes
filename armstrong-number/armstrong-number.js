// Armstrong Number Checker in JavaScript

let num = 153; // Change this to test other numbers
let numStr = num.toString();
let numLen = numStr.length;

let sum = 0;
for (let ch of numStr) {
    sum += Math.pow(parseInt(ch), numLen);
}

if (sum === num) {
    console.log(num + " is an Armstrong number.");
} else {
    console.log(num + " is NOT an Armstrong number.");
}
