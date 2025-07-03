public class Reverse {
  public int reverse(int x) {
        
        boolean isNegativeNumber = false;
        if(x < 0)
        {
            isNegativeNumber = true;
            x = -1 * x;
        }

        int result = 0;
        int previousVal = 0;
        while(x > 0)
       
        return isNegativeNumber ? -1 * result : result;
    }
}
