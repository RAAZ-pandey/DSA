function reverse(num)
{
  let reversed = 0;
  let isNegative = num < 0;
  num = Math.abs(num);  // to get the absolute value

  while (num > 0)
  {
    let digit = num % 10;  //Get last digit
    reversed = reversed * 10 + digit;  //Append digit to reversed number
    num = Math.floor(num / 10 ); //Remove last digit

  }
  return isNegative ? -reversed : reversed; //restore negative sign if needed
}

