// 1-2+3-4.......-10

function calculateAlternate(n)
{
  let sum = 0;

  for (let i = 1; i <= n; i++)
  {
    sum += (i % 2 === 0) ? -i : i;
  }
  console.log(sum);
}

calculateAlternate(10);