public class OrderAgnosticsBs {
  public static void main(String[] args) {
    int[] arr = { -17, -12, -5, 0, 3, 16, 34, 47, 58, 68, 99, 225 };
    int ans = binarysearch(arr, 99);
    System.out.println(ans);
  }

  static int binarysearch(int[] arr, int target) {

    int start = 0;
    int end = arr.length - 1;

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      // if array is sorted in ascending order
      if (isAsc) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else if (target > arr[mid]) {
          start = mid + 1;
        }
        // if array is sorted in decending order
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else if (target < arr[mid]) {
          start = mid + 1;
        }
      }
    }
    return -1;
  }
}
