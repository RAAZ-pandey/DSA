public class Solution {
   public static void main(String[] args) {
    patterns1(4);
   }

   static void patterns1(int num) {
      for (int i = 0; i<= num; i++) {
        for (int j = 0; j < i ; j++) {
           System.out.print("*");
        }
        System.out.println();
      }
   }
}
