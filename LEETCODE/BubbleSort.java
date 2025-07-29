
import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 8, 1, -15, -1, 0, 87, -54};
    sorting(arr);
    System.out.println(Arrays.toString(arr));

  }

  static void sorting(int[] arr) {

    boolean swapped = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        // swap if element is smaller than previos element
        if (arr[j] < arr[j - 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swapped = true;
        }
      }
    if (!swapped) {
      break;
    }    
   }
  }
}
