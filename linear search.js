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