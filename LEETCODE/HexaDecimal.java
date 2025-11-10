public class HexaDecimal {
    public String toHex(int num){

      if (num == 0)  return "0";

      char[] hexa = "0123456789abcdef".toCharArray();
      StringBuilder x = new StringBuilder();

      while (num != 0 && x.length() < 8) {
        int temp = num & 15;
        x.append(hexa[temp]);
        num >>>= 4;
      }
      return x.reverse().toString();
    }
}
