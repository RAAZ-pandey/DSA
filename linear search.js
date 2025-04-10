function linearsearch(arr, target)
{
  for (let i = 0; i < arr.length; i++)
  {
    if (arr[i] === target)
    {
      return i; //return th index if found
    }
  }
  return -1;
}

const arr = [10, 20, 30, 40, 50, 60];
const target = 40;

const result = linearsearch(arr, target);
if (result !== -1)
{
  console.log(`Element found at index ${result}`);
}
else
{
  console.log("Element not found");
}