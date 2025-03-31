function factorial(n)
{
  if (n === 0 || n === 1)
    return 1;

  for (let i = 2; i <= n; i++)
  {
    fact *= i;    
  }
  return fact;
}

function calculateSeries(limit)
{
  let sum = 0;
  for (let i = 1; i <= limit; i++)
  {
    sum += i / factorial(i);
  }
  return sum;
}

console.log(calculateSeries(10));