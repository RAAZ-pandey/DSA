

public class Seaarch2dMatrix {
  public static void main(String[] args) {
    int[][] arr = {
        { 23, 4, 1 },
        { 18, 12, 3 },
        { 78, 99, 34 },
        { 18, 16, 56 }
    };
    int target = 56;
    System.out.println(searchElement(arr, target));
  }


  static boolean searchElement(int[][] arr, int target) {
    int row = 0;
    int col = arr[0].length - 1;

    while (row < arr.length && col >= 0) {
      if (arr[row][col] == target) {
        return true;
      } else if(arr[row][col] > target) {
          col--;
      } else {
          row++;
      }
    }

    return false;
  }
}
