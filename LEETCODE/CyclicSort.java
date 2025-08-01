import java.util.Arrays;

public class CyclicSort { 
  public static void main(String[] args) {
     int[] arr = {5, 4, 0, 3, 2, 1};
      sort(arr);
      System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int i =0;
    while (i < arr.length) {
      int check = arr[i] - 1;
      if( arr[i] != arr[check]) {
          swap(arr, i, check);
      } else {
        i++;
      }

    }
  }

 static void swap(int[] arr, int i, int check) {
  int temp = arr[i];
  arr[i] = arr[check];
  arr[check] = temp;
 }
}
