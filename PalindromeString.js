function isStringPalindrome(str)
{
  let left = 0;
  let right = str.length - 1;

  while (left < right)
  {
    if (str[left] !== str[right])
       {
          return false;
        }
        left++;
        right--;
  }
  return true;
}

// Example usage:
console.log(isStringPalindrome("madam"));   // true
console.log(isStringPalindrome("racecar")); // true
console.log(isStringPalindrome("hello"));   // false