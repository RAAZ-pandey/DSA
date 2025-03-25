function Nto1(n) {
  if (n < 1) return;
  console.log(n);
  Nto1(n-1);
}

Nto1(20);