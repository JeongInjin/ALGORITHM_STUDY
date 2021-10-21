package LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class easy1_TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.print(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchValue = target - nums[i];
            if (valueMap.get(searchValue) != null) {
                return new int[]{(int) valueMap.get(searchValue), i};
            } else {
                valueMap.put(nums[i], i);
            }
        }
        return new int[]{1, 2};
    }

}

