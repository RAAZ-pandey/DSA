import java.util.*;

public class ThreeSum {

  List<List<Integer>> threeSum(int[] arr) {
    
    if (arr == null || arr.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    return new ArrayList<>(result);
  }
}