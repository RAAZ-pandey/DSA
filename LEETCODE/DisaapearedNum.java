import java.util.ArrayList;
import java.util.List;

public class DisaapearedNum {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    int i =0;
    while (i < nums.length) {
      int check = nums[i] - 1;
      if( nums[i] != nums[check]) {
          swap(nums, i, check);
      } else {
        i++;
      }
    } 

    List<Integer> ans = new ArrayList<>();
    for (int index = 0; index < nums.length; index++) {
        if(nums[index] != index + 1) {
            ans.add(index + 1);
        }
    }
    return ans;
  }

  void swap(int[] arr, int i, int check) {
  int temp = arr[i];
  arr[i] = arr[check];
  arr[check] = temp;
 }
}
