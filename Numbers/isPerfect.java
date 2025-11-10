package Numbers;

public class isPerfect {
  public static void main(String[] args) {
    System.out.println(perfect(6));    
    System.out.println(perfect(16));    
    System.out.println(perfect(496));    
  }


  static boolean perfect(int n) {
    if (n <= 1) return false;

    int sum = 1;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if( n % i == 0){
        sum += i;

        int temp = n / i;
        if (temp != i) {
          sum += temp;
        }
      }
    }

    return sum == n;
  }
}
