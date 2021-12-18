package LeetCode.Medium;
/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */
public class medium_11ContainerWithMostWater {
    //좋은 방법이군..!!
    class SolutionImproved {
        public int maxArea(int[] height) {
            int max = 0;
            int start = 0;
            int end = height.length-1;

            while(start < end){
                max = Math.max((end-start) * Math.min(height[start], height[end]), max);
                if(height[start] < height[end]){
                    start++;
                }else{
                    end--;
                }
            }

            return max;
        }
    }

    //Time Limit Exceeded 떨어짐..O(n^2)여서 그런듯 줄여봐야겠다.
    class Solution {
        public int maxArea(int[] height) {
            int result = 0;

            for(int i = 0; i < height.length; i++){
                int compareIndex = i;
                for(int k = 0; k < height.length; k++){
                    if(compareIndex != k){
                        int maxHeight = Math.min(height[i], height[k]);
                        int compareWater = (k - compareIndex) * maxHeight;
                        if(compareWater > 0 && result < compareWater){
                            result = compareWater;

                        }
                    }
                }
            }

            return result;
        }
    }
}
