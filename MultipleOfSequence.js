function generateSequence(n)
{
  let a =1, b= 2;
  console.log(a);
  console.log(b);

  for (let i = 2; i < n; i++)
  {
    let next = a * b;
    console.log(next);
    a = b;
    b =next;
  }
}

generateSequence(10);