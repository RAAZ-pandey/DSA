public class Reverse {
  public int reverse(int x) {
        
        boolean isNegativeNumber = false;
        if(x < 0)
        {
            isNegativeNumber = true;
            x = -1 * x;
        }

       
        return isNegativeNumber ? -1 * result : result;
    }
}
