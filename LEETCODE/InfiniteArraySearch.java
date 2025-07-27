public class InfiniteArraySearch {
  public static void main(String[] args) {

  }

  static int ans(int[] arr, int target) {

    // to find the range of array intailize array with assuming size 2
    int start = 0;
    int end = 1;

    // until we reach to range to target keep streching the array
    while (target > arr[end]) {
      int temp = end + 1; // this is my new start

      // double the range of array using this formula
      end = end + (end - start + 1);
      start = temp;
    }
    return binarysearch(arr, target, start, end);
  }

  static int binarysearch(int[] arr, int target, int start, int end) {

    while (start <= end) {
      // find the middle element of array
      // int mid = (start + end) / 2;
      // sometime the value of mid can exceed the limit of integer value (possible)
      // tacling that edge case
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else
        // target found
        return mid;

    }

    return -1;
  }
}
