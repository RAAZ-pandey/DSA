public class MaximumWealth {
  public static void main(String[] args) {
    
  }
   static int maximumWealth(int[][] accounts) {
        int ans =Integer.MIN_VALUE;
        for(int[] ints: accounts){
            int sum = 0;
            for( int col : ints){
                sum += col;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
