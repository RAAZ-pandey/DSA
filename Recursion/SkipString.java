package Recursion;

public class SkipString {
  public static void main(String[] args) {
    System.out.println(skip("Ribgodhu"));
  }

  static String skip(String q) {
    if(q.isEmpty()){
      return "";
    }


    if (q.startsWith("god")) {
      return skip(q.substring(3));
    } else {
      return q.charAt(0) + skip(q.substring(1));
    }
  }
}
