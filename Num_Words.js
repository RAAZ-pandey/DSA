function numToWords(num)
{
  if(isNaN(num))
  {
    console.log("please enter a valid number");
    return;
  }

  const words = ["Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"];

  let numstr = Math.abs(num).toString();
  let result = [];

  for (let digit of numstr)
  {
    result.push(words[parseInt(digit)]);
  }

  if (num < 0)
  {
    result.unshift("Minus");
  }

  console.log(result.join(" "));
}

const input = prompt("Enter an integer number:");
numToWords(parseInt(input));