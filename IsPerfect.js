function isPerfectNumber(num)
{
  if (num <= 1)
    return false;

  let sum = 0;

  for (let i = 1; i<= num / 2; i++)
  {
    if(num % i === 0)
    {
      sum += i;
    }
  }

  return sum === num;
}

let number = 6;

if (isPerfectNumber(number))
{
  console.log(`${number} is a perfect number`);
}
else{
  console.log(`${number} is  not a perfect number`);
}