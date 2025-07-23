public class MaximumElement {
  public static void main(String[] args) {
      int[] arr = { 10, 25, 58, 89, 96, 63, 32 };

      System.out.println(maxRange(arr, 0, 3));
  }


   static int maxRange(int[] arr, int start, int end) {


    //edge cases
    if(start > end){
      return -1;
    }

    if (arr == null) {
      return -1;
    }

    int maxVal = arr[0];
    for (int i = start; i < end; i++) {
       if (arr[i]>maxVal) {
        maxVal = arr[i];
       }
    }

    return maxVal;
    
  }
  

  static int max(int[] arr) {

    // edge case
    if (arr.length ==0 ) {
      return -1;
    }

    int maxVal = arr[0];
    for (int i = 1; i < arr.length; i++) {
       if (arr[i]>maxVal) {
        maxVal = arr[i];
       }
    }

    return maxVal;
    
  }
  
}
