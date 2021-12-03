package LeetCode.Easy;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 */

import java.util.Scanner;

public class easy35_SearchInsertPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Solution.searchInsert(nums, target));
    }
    static class Solution {
        public static int searchInsert(int[] nums, int target) {
            int answer = -1;
            int mid = -1;
            int low = 0;
            int high = nums.length - 1;
            int failCheck = -1;
            while (low <= high){
                mid = (low + high) / 2;
                if(target == nums[mid]) return mid;
                else if(target < nums[mid]) high = mid - 1;
                else low = mid + 1;
            }
            if(low > high) return high + 1;

            return answer;
        }
    }

}

