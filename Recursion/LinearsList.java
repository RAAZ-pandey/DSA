package Recursion;

import java.util.ArrayList;

public class LinearsList {
   public static void main(String[] args) {
    int[] arr = {-15, -5, 0, 1, 2, 6, 6, 11, 15};
    int target = 6;

    ArrayList<Integer> ans = searchAll(arr, target, 0, new ArrayList<>());
    System.out.println(ans);
  }
  

 

 
  static ArrayList<Integer> searchAll(int[] arr, int target, int index, ArrayList<Integer> list ) {
     if(index == arr.length){
      return list;
    }

    if(arr[index] == target){
       list.add(index);
    }
    return searchAll(arr, target, index + 1, list);
  }
}
