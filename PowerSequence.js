function multiple(n)
{
  let num = 1;
  let power = 1;


  for (let i =0; i < n; i++)
  {
    console.log(num);
    num = Math.pow(2, power);
    power = num;
  }
}

multiple(10);