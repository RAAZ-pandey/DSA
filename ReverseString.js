let original = "luma";
let reversed = "";

for (let i = original.length - 1; i >= 0; i--) {
    reversed += original[i];
}

console.log("Original string:", original);
console.log("Reversed string:", reversed);
