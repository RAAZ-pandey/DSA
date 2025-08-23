package Recursion;

public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {-15, -5, 0, 1, 2, 6, 8, 11, 15};
    int target = 11;
    System.out.println(search(arr, target, 0));
    System.out.println(search1(arr, target, 0));
  }
  

  // return the index of element if it is present in the array
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

  // return true/false based on presence of target element in the array
  static boolean search1(int[] arr, int target, int index){

    if(index == arr.length){
      return false;
    }

   return arr[index] == target || search1(arr, target, index + 1);
  }
}
