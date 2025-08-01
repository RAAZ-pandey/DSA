public class FindDuplicate {

  // Best and efficient solution
    // public int findDuplicate(int[] nums) {
    //       int[] ans = new int[nums.length];
    //     for(int i: nums){
    //         if(ans[i] == -1){
    //             return i;
    //         }
    //         ans[i] = -1;
    //     }
    //     return -1;
    // }

    // using cycle sort method
     public int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1 ) {
                int check = nums[i] - 1;
                if(nums[i] != nums[check]) {
                    swap(nums, i, check);
                } else {
                    return nums[i];
                }
            }else {
                i++;
            }
        }
        return -1;
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
