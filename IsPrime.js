let num = 28; // You can change this number to test
let isPrime = true;

if (num <= 1) {
    isPrime = false;
} else {
    for (let i = 2; i <= num / 2; i++) {
        if (num % i === 0) {
            isPrime = false;
            break;
        }
    }
}

if (isPrime) {
    console.log(num + " is a prime number.");
} else {
    console.log(num + " is not a prime number.");
}
