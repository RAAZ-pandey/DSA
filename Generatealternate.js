function generateSeries() {
  let start = 1, end = 10;
  let result = [];

   while (start <= end) 
   {
    result.push(start++);
    if (start <= end)
      result.push(end--);
   }

   console.log(result.join(" "));
}

generateSeries();