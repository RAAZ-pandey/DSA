function binarySearch(arr, target) {
  let left = 0;
  let right = arr.length - 1;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);

    if (arr[mid] === target) {
      return mid; // Element found
    } else if (arr[mid] < target) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }

  }
  return -1; // Element not found

}

// Example usage:
const sortedArray = [2, 5, 8, 12, 16, 23, 38, 56, 72];
const target = 38;

const result = binarySearch(sortedArray, target);

if (result !== -1) {
  console.log(`Element found at index ${result}`);
} else {
  console.log("Element not found");
}