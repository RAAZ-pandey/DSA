//Without using predefined functions

// let original = "luma";
// let reversed = "";

// for (let i = original.length - 1; i >= 0; i--) {
//     reversed += original[i];
// }

// console.log("Original string:", original);
// console.log("Reversed string:", reversed);

// with use of predefined methods

let original = "LUMA";
let reversed = original.split("").reverse().join("");

console.log("Original string:", original);
console.log("Reversed string:", reversed);

