package Numbers;

public class Armstrong {
  public static void main(String[] args) {
    System.out.println(armstrong(153));
  }


  static Boolean armstrong( int num) {
   int digits = String.valueOf(num).length();
   int sum = 0;
   int temp = num;

   while(temp > 0) {
     int digit = temp % 10;
     sum += (int)Math.pow(digit, digits);
     temp /= 10;
  }
 return sum == num;
}
}
