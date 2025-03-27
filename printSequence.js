// 1, 2, 4, 7, 11, 16.....n


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

printSequence(15);