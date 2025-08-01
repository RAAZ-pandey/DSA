public class FindDuplicate {

  // Best and efficient solution
    public int findDuplicate(int[] nums) {
          int[] ans = new int[nums.length];
        for(int i: nums){
            if(ans[i] == -1){
                return i;
            }
            ans[i] = -1;
        }
        return -1;
    }
}
