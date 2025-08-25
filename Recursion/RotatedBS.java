package Recursion;

public class RotatedBS {
  public static void main(String[] args) {
    
  }
  
  static int search(int[] arr, int target, int start, int end){

    if(start > end){
      return -1;
    }

    int mid = start + (end - start) / 2;

    if(target == arr[mid]) {
      return mid;
    }

    if (arr[start] <= arr[mid]) {
      if (target >= arr[start] && target <= arr[mid]) {
        return search(arr, target, start, mid - 1);
      }else {
        return search(arr, target, mid + 1, end);
      }
    }

    if ( target >= arr[mid] && target <= arr[end]){
      return search(arr, target, mid + 1, end);
    }else {
         return search(arr, target, start, mid - 1);
    }
  
  }
}
