package Recursion;

public class Stream {
  public static void main(String[] args) {
    skip("", "baaoasaas");
  }

  static void skip(String p, String q) {
    if(q.isEmpty()){
      System.out.println(p);
      return;
    }

    char ch =q.charAt(0);

    if (ch == 'a') {
      skip(p, q.substring(1));
    } else {
      skip(p + ch, q.substring(1));
    }
  }
}
