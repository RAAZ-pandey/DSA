package Numbers;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
      int converted = convertfive(20205);
      System.out.println(converted);
    }


  static int convertfive(int num) {
    int ans = 0;
    int place = 1;
    int count = 0;

    if (num == 0)  return 0;

    while (num > 0) {
      int temp = num % 10;
      if (temp == 0) {
        temp = 5;
        count++;
        System.out.println(place); // for getting place of zero in number
      }

      
      ans = temp * place + ans;
      place *= 10;
      num /= 10;
    }
    System.out.println(count); // to get number of zeroes
    
    return ans;
  }
}
