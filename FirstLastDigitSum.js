function sumFirstLAstDigit(n)
{
   let lastDigit = n % 10;
   let firstDigit = n;
   while (firstDigit >= 10)
   {
    firstDigit = Math.floor(firstDigit / 10);
   }
   return firstDigit + lastDigit;
}

console.log(sumFirstLAstDigit(932561));