public class MinMaxArray {
  public static void main(String[] args) {
    int[] arr = { 10, 25, 58, -7, 89, 96, 63, -13, 132 };
    System.out.println(min(arr));
     System.out.println(max(arr));
  }

  // check and return maximun value in array
   static int max(int[] arr){
    if(arr.length == 0){
      return -1;
    }

      int ans = arr[0];
      for (int i = 0; i < arr.length; i++) {
      if(arr[i] > ans){
        ans = arr[i];
      }
    }
    return ans;
  }

// check and return the minimum value in array
  static int min(int[] arr){
    if(arr.length == 0){
      return -1;
    }

      int ans = arr[0];
      for (int i = 0; i < arr.length; i++) {
      if(arr[i] < ans){
        ans = arr[i];
      }
    }
    return ans;
  }
  
}
