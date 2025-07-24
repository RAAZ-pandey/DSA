public class LinearSearch {
  public static void main(String[] args) {
     int[] arr = { 10, 25, 58, 89, 96, 63, 32 };

    int ans = searchIndex(arr, 96);
    System.out.println(ans);
    int answer = searchElement(arr, 96);
    System.out.println(answer);
    boolean found = search(arr, 63);
    System.out.println(found);
  }

  //search for element in array and retorn that element if found
  static int searchElement(int[] arr, int target){
    // Edge case if array has no element
      if(arr.length == 0){
        return -1;
      }
        // search element in the array
     // for (int index = 0; index < arr.length; index++) {
      for (int element : arr) {        //for each loop for efficient searching
        if (element == target){
          return element;
        }
      }
      return -1;
  }

  
  static boolean search(int[] arr, int target){
    // Edge case if array has no element
      if(arr.length == 0){
        return false;
      }
        // search element in the array
      for (int element : arr) {        //for each loop for efficient searching
        if (element == target){
          return true;
        }
      }
      return false;
  }


  // search for element and return the index at which element is found
  static int searchIndex(int[] arr, int target){
    // Edge case if array has no element
      if(arr.length == 0){
        return -1;
      }
        // search element in the array
      for (int index = 0; index < arr.length; index++) {
        int element = arr[index]; 
        if (element == target){
          return index;
        }
      }

      
      return -1;
  }
}

