public class Solution {
   public static void main(String[] args) {
    patterns1(4);
   }

   static void patterns1(int num) {
      for (int row = 0; row <= num; row++) {
        for (int col = 0; col < row ; col++) {
           System.out.print("*");
        }
       System.out.println();
      }
   }
}
