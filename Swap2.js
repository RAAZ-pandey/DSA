let a = 10;
let b = 5;

console.log("Before swapping:");
console.log("a =", a, "b =", b);

// Swapping without third variable
a = a + b;
b = a - b;
a = a - b;

console.log("After swapping:");
console.log("a =", a, "b =", b);
