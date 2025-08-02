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
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }

  
}
