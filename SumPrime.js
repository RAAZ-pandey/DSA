function isprime(num)
{
  if(num < 2)
    return false;
  for (let i=2; i*i<=num; i++)
  {
      if (num % i === 0)
        return false;
  }
  return true;
}

let sum = 0;

for (let num = 1; num<= 25; num ++)
{
  if (isprime(num))
  {
    sum += num;
  }
}

console.log("Sum of prime numbers between 1 and 25:", sum);