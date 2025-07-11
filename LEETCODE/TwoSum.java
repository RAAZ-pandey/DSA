import java.util.*;

// this code contains only function solution of leetcode based on testcases , independently this code won't give any output

class TwoSum {
    //1st method using brute force method , this way time complexicity will be O(n^2)

  int[] twoSumBruteForce(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j] == target)
          return new int[]{i, j};
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }

  int[] twoSumSorting(int[] nums, int target) {
      int[] copyArray = Arrays.copyOf(nums, nums.length);
      Arrays.sort(copyArray);

      int head = 0;
      int tail = copyArray.length - 1;
      int num1 = 0, num2 = 0;
      while (head < tail) {
        int sum = copyArray[head] + copyArray[tail];
        if (sum < target) {
          head++;
        }
        else if (sum > target) {
          tail--;
        } else {
          num1 = copyArray[head];
          num2 = copyArray[tail];
          break;
        }
    }

    // Create the result array with indices
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == num1) result[0] = i;
      if (nums[i] == num2) result[1] = i;
    }
    return result;
  }

  //2nd and most efficient way. use hashmap & using this method time complexicity will be minimum O(N).
  
  int[] twoSumHashing(int[] nums, int target) {

    // Create a HashMap
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      // Get the complement using the target value
      int complement = target - nums[i];

      // Search the hashmap for complement, if found, we got our pair
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }

      // Put the element in hashmap for subsequent searches.
      map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

 
}