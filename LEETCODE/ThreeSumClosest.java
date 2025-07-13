import java.util.Arrays;

public class ThreeSumClosest {
  
  int threeSumClosest(int[] arr, int target) {

    // Sort the elements
    Arrays.sort(arr);
    int resultSum = arr[0] + arr[1] + arr[2];
    int minDifference = Integer.MAX_VALUE;

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++) {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      
    }
    return resultSum;
  }
}
