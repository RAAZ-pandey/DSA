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
}
