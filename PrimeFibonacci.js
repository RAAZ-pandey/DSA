function isPrime(num)
{
  if (num < 2)
      return false;

  for ( let i = 2; i*i <= num; i++)
  {
    if (num % i === 0)
        return false;
  }
  return true;
}

function fibonacciPrimes(n)
{
  let a = 0, b = 1, count = 0;

  while (count < n)
  {
    let next = a + b;
    a = b;
    b = next;

    if (isPrime(next))
    {
      console.log(next);
      count++;
    }
  }
}

fibonacciPrimes(10);