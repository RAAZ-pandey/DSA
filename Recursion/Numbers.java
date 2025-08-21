package Recursion;

public class Numbers {
  public static void main(String[] args) {
   // nums(8);
   // System.out.println("now print in ascending");
  // Anums(8);
   nums(8);
  }

  // static void nums(int n) {
    
  //   if (n == 0) {
  //     return;
  //   }
  //   System.out.println(n);
  //   nums(n - 1);
  // }

  //   static void Anums(int n) {
    
  //   if (n == 0) {
  //     return;
  //   }

  //   Anums(n - 1);
  //   System.out.println(n);
  // }

  static void nums(int n) {
    
    if (n == 0) {
      return;
    }
    
    System.out.println(n);
    nums(n - 1);
    System.out.println(n);
  }
}
