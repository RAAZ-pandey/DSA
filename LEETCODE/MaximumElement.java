public class MaximumElement {
  public static void main(String[] args) {
      int[] arr = { 10, 25, 58, 89, 96, 63, 32 };

      System.out.println(max(arr));
  }

  static int max(int[] arr) {

    int maxVal = arr[0];
    for (int i = 1; i < arr.length; i++) {
       if (arr[i]>maxVal) {
        maxVal = arr[i];
       }
    }

    return maxVal;
    
  }
  
}
