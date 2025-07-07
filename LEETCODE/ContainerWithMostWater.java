public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

          int area =
              Math.min(height[left], height[right])
              * (right - left);

          maxArea = Math.max(area, maxArea);

          if (height[left] < height[right])
            left++;
          else
            right--;
        }

    return maxArea;
  }

}

//solution from leetcode with least runtime(time Complexity)
// class Solution {
//     public int maxArea(int[] height) 
//     {int a=0,b= height.length-1;
//     int max= 0;
//     while(a<b)
//     {int minV = Math.min(height[a],height[b]); //shorter wall
//     int area = minV*(b-a);  //calculate the water held by container
//     max= Math.max(area,max);
//     while(height[a]<=minV && a<b) a++;
//     while(height[b]<=minV && a<b) b--;
// }
//     return max;
//     }
// }
