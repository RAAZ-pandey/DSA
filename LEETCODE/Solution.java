public class Solution {
   public static void main(String[] args) {
      patterns1(4);
      System.out.println("Next pattern");
      patterns2(5);
      System.out.println("Next pattern");
      patterns3(5);
      System.out.println("Next pattern");
      patterns4(5);
   }

   static void patterns1(int num) {
      for (int row = 1; row <= num; row++) {
        for (int col = 1; col < row ; col++) {
           System.out.print("*");
        }
       System.out.println();
      }
   }

   
   static void patterns2(int num) {
      for (int row = 1; row <= num; row++) {
        for (int col = 1; col < num ; col++) {
           System.out.print("*");
        }
       System.out.println();
      }
   }

   
   static void patterns3(int num) {
      for (int row = 1; row <= num; row++) {
        for (int col = 1; col < num - row + 1; col++) {
           System.out.print("*");
        }
       System.out.println();
      }
   }

    static void patterns4(int num) {
      for (int row = 1; row <= num; row++) {
        for (int col = 1; col < row ; col++) {
           System.out.print(col);
        }
       System.out.println();
      }
   }
}
