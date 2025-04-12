function findLargest(arr)
{
  if(arr.length === 0)
  {
    return "Array is empty" ;
  }

  let largest = arr[0];

  for (let i = 1; i < arr.length; i++)
  {
    if (arr[i] > largest)
    {
      largest = arr[i];
    }
  }
  return largest;
}

// Example usage
const numbers = [12, 45, 78, 34, 89, 23];
console.log("Largest number is:", findLargest(numbers));