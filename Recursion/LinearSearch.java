package Recursion;

public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {-15, -5, 0, 1, 2, 6, 8, 11, 15};
    int target = 11;
    System.out.println(search(arr, target, 0));
    System.out.println(search1(arr, target, 0));
  }
  
  static int search(int[] arr, int target, int index){

    if(index == arr.length){
      return -1;
    }

    if(arr[index] == target){
      return index;
    } else {
      return search(arr, target, index + 1);
    }
    
  }

  static boolean search1(int[] arr, int target, int index){

    if(index == arr.length){
      return false;
    }

   return arr[index] == target || search1(arr, target, index + 1);
  }
}
