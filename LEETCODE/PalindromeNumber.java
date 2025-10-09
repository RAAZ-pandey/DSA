public class PalindromeNumber {
  public static void main(String[] args) {
    int num = 12321;
    System.out.println(palindrome(num));
  }

  static int palindrome(int num){
    if(num < 0){
      return -1;
    }

   int temp = num;
   int reverse = 0;
   while (temp > 0) {
     int sed = temp % 10;
     reverse = reverse * 10 + sed;
     temp /= 10;
   }
   if (num == reverse) {
    return num;
   }else{
    return -1;
   }
  }
}
