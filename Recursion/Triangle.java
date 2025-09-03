package Recursion;

public class Triangle {
  public static void main(String[] args) {
    print(5, 0);
    print1(5, 0);
  }

  // for triangle upside down
  static void print(int r, int c) {
    if (r == 0) {
      return;
    }

    if(c < r) {
      System.out.println("*");
      print(r, c+1);
    } else {
      System.out.println();
      print(r-1, 0);
    }
  }

  // For real traingle
  static void print1(int r, int c) {
    if (r == 0) {
      return;
    }

    if(c < r) {
      print(r, c+1);
      System.out.println("*");
    } else {
      print(r-1, 0);
      System.out.println();
    }
  }
}
