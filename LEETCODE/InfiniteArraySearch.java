public class InfiniteArraySearch {
   public static void main(String[] args) {
    
   }
  
    static int ans(int[] arr, int target) {

      int start = 0;
      int end = 1;

      while(target > arr[end]) {
        int temp = end + 1;

         end = end + (end - start + 1);
         start = temp ;
      }
      return -1;
    }

    static int binarysearch(int[] arr, int target){

    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      //find the middle element of array
     // int mid = (start + end) / 2;
      // sometime the value of mid can exceed the limit of integer value (possible)
      //tacling that edge case
      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
          start = mid + 1;
      }else 
      // target found
        return mid;

    }

    return -1;
   }
}
