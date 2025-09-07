package Recursion;

public class Subset {
   public static void main(String[] args) {
    skip("", "abc");
   }

    static void skip(String p, String q) {
    if(q.isEmpty()){
      System.out.println(p);
      return;
    }

    char ch =q.charAt(0);

      skip(p, q.substring(1));
      skip(p + ch, q.substring(1));
  }
}
