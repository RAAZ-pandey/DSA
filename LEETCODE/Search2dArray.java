import java.util.Arrays;

public class Search2dArray {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, 1 },
        { 18, 12, 3, 9 },
        { 78, 99, 34, 56 },
        { 18, 16 }
    };
    int target = 16;
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));
    int answer = max(arr);
    System.out.println(answer);
    int answer1 = min(arr);
    System.out.println(answer1);
  }
  // Search for element in an array
  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }

  // find the maximum value in the array
  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
      for (int[] ints : arr) {
        for (int element : ints) {
          if (element > max) {
            max = element;

          }
        }
      }
    return max;
  }

   static int min(int[][] arr) {
    int min = Integer.MAX_VALUE;
      for (int[] ints : arr) {
        for (int element : ints) {
          if (element < min) {
            min = element;
          }
        }
      }
    return min;
  }
}
