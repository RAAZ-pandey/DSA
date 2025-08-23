package Recursion;

import java.util.ArrayList;

public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {-15, -5, 0, 1, 2, 6, 6, 11, 15};
    int target = 6;
    System.out.println(search(arr, target, 0));
    System.out.println(search1(arr, target, 0));
    System.out.println(search2(arr, target, arr.length-1));
    searchAll(arr, target, 0);
    System.out.println(list);
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

  // search from and return the index of element if it is present in the array
  static int search2(int[] arr, int target, int index){

    if(index == 0){
      return -1;
    }

    if(arr[index] == target){
      return index;
    } else {
      return search(arr, target, index - 1);
    }
    
  }

  // return true/false based on presence of target element in the array
  static boolean search1(int[] arr, int target, int index){

    if(index == arr.length){
      return false;
    }

   return arr[index] == target || search1(arr, target, index + 1);
  }


  // returning all indexes at which the target element is present 
  static ArrayList<Integer> list = new ArrayList<>();
  static void searchAll(int[] arr, int target, int index) {
     if(index == arr.length){
      return ;
    }

    if(arr[index] == target){
       list.add(index);
    }
    searchAll(arr, target, index + 1);
  }
}
