package Recursion;

import java.util.ArrayList;

public class LinearsList {
   public static void main(String[] args) {
    int[] arr = {-15, -5, 0, 1, 2, 6, 6, 11, 15};
    int target = 6;

    ArrayList<Integer> ans = searchAll(arr, target, 0, new ArrayList<>());
    System.out.println(ans);
    ArrayList<Integer> ans1 = searchAll1(arr, target, 0);
    System.out.println(ans1);
  }
  
  // searching all indexes at which target element is present and returning it in a list 
  static ArrayList<Integer> searchAll(int[] arr, int target, int index, ArrayList<Integer> list ) {
     if(index == arr.length){
      return list;
    }

    if(arr[index] == target){
       list.add(index);
    }
    return searchAll(arr, target, index + 1, list);
  }

    // searching all indexes at which target element is present and returning it in a list 
  static ArrayList<Integer> searchAll1(int[] arr, int target, int index) {

    ArrayList<Integer> list = new ArrayList<>();

     if(index == arr.length){
      return list;
    }

    if(arr[index] == target){
       list.add(index);
    }
    ArrayList<Integer> findBelow = searchAll1(arr, target, index + 1);
    list.addAll(findBelow);
    
    return list;
  }

}
