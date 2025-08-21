package Recursion;

public class Reverse {
   static int sum = 0;
   static void reverse2(int n) {
     if (n == 0) {
      return;
     }
     int rem = n % 10;
     sum = sum * 10 + rem;
     reverse2(n / 10);
   }

   public static void main(String[] args) {
    reverse2(13456);
    System.out.println(sum);
   }
}
