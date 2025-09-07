package Recursion;

public class Stream {
  public static void main(String[] args) {
    skip("", "baaoasaas");
    System.out.println(skip1("aaRaiabaihaaaua"));
  }

  // printing the answer string after skiping a specific character
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

  // returning answer after skiping a specific character
  
  static String skip1(String q) {
    if(q.isEmpty()){
      return "";
    }

    char ch = q.charAt(0);

    if (ch == 'a') {
      return skip1(q.substring(1));
    } else {
      return ch + skip1(q.substring(1));
    }
  }
}
