function printSequence(n)
{
  let num = 1, diff = 1;
  for (let i = 0; i< n; i++)
  {
    console.log(num);
    num += diff;
    diff++;
  }
}