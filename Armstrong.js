function isArmstrong(num)
{
  let sum = 0,  temp = num;
  while(temp > 0)
  {
    let digit = temp % 10;
    sum += digit ** 3;
    temp = Math.floor(temp / 10);
  }

  return sum == num;
}

