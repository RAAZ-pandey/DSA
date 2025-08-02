public class Mismatch {
   public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int check = nums[i] - 1;
            if (nums[i] != nums[check]) {
                swap(nums, i, check);
            } else {
                i++;
            }
        }
      
  
}
