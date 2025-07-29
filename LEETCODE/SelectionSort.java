import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
     int[] arr = {5, 4, 3, 8, 1, -15, -1, 0, 87, -54};
    sorting(arr);
    System.out.println(Arrays.toString(arr));

  }

 static void sorting(int[] arr) {
     for (int i = 0; i < arr.length; i++) {
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);

     }
  }


  static int getMaxIndex(int[] arr, int start, int end) {
     int max =start;

      for (int i = start; i <= end; i++) {
        if(arr[max] < arr[i]) {
          max = i;
        }
      }
     return max;
  }
  
}
