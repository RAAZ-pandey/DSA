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

function Display(limit)
{
  console.log(`Perfect numbers from 1 to ${limit}:`);
    
  for (let i = 1; i<= limit; i++)
  {
    if (isPerfectNumber(i))
    {
      console.log(i);
    }
  }
}

let limit = 10000;
Display(limit);