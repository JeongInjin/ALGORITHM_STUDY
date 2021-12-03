package LeetCode.Easy;

import java.util.HashMap;
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class easy169_MajorityElement {
//    class Solution {
//        public int majorityElement(int[] nums) {
//            HashMap<Integer, Integer> map = new HashMap<>();
//            int maxValue = Integer.MIN_VALUE;
//            int answer = -1;
//
//            for(int i = 0; i < nums.length; i++){
//                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//
//                maxValue = Math.max(map.get(nums[i]), maxValue);
//
//                if(maxValue <= map.get(nums[i])) answer = nums[i];
//
//
//                System.out.println(map.get(nums[i]));
//            }
//            return answer;
//        }
//    }
    // 추가 작업분..
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer v : nums){
            map.put(v, map.getOrDefault(v, 0) + 1);
            if(map.get(v) > nums.length / 2) return v;
        }
        return -1;
    }
}
}
