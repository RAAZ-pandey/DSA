function sumOfDigits(num)
{
  let sum = 0;
  while (num > 0)
  {
    let lastDigit = num - (num / 10) * 10 //Extract last digit
    while (lastDigit >= 10)lastDigit -= 10; //reduce last digit to single digit
    sum += lastDigit;
    num = (num - lastDigit) / 10; //remove last digit
    while (num >= 10 && num % 10 !== num)num -= num  % 10;
  }
  return sum;
}

let num = 5478;
console.log("Sum of digits:", sumOfDigits(num));