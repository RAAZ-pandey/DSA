// function isPrime(num)
// {
//   if (num < 2)
//       return false;

//   for ( let i = 2; i*i <= num; i++)
//   {
//     if (num % i === 0)
//         return false;
//   }
//   return true;
// }

// function fibonacciPrimes(n)
// {
//   let a = 0, b = 1, count = 0;

//   while (count < n)
//   {
//     let next = a + b;
//     a = b;
//     b = next;

//     if (isPrime(next))
//     {
//       console.log(next);
//       count++;
//     }
//   }
// }

// fibonacciPrimes(10);

function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i * i <= n; i++) {
      if (n % i === 0) return false;
  }
  return true;
}

function fibonacciPrimes(count) {
  let fib = [0, 1];
  let result = [];
  let i = 2;
  
  while (result.length < count) {
      let nextFib = fib[i - 1] + fib[i - 2];
      fib.push(nextFib);
      if (isPrime(nextFib)) {
          result.push(nextFib);
      }
      i++;
  }
  return result;
}

console.log(fibonacciPrimes(10));
