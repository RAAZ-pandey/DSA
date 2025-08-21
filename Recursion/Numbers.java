package Recursion;

public class Numbers {
  public static void main(String[] args) {
    nums(80);
  }

  static void nums(int n) {
    
    if (n == 0) {
      return;
    }
    System.out.println(n);
    nums(n - 1);
  }
}
