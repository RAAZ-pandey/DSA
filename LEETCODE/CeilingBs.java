public class CeilingBs {
   public static void main(String[] args) {
    int[] arr = {-17, -12, -5, 0, 3, 16, 34, 47, 58, 68, 99, 225};
    int ans = search(arr, 55);
    System.out.println(ans);
   }

   static int search(int[] arr, int target){

    int start = 0;
    int end = arr.length - 1;

        //EdgeCase :- what if there is no larger number than target in array
      if(target > arr[end]){
        return -1;
      }

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
  //  if target not found then returnibg the smallestelement greater than target
    return start;
   }
}
