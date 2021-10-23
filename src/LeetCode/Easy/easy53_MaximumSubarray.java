package LeetCode.Easy;
/*
* nums 가 1개일때 예외가 터져서 추가함.
* 최소 단위의 문제점을 잘 체크해야할듯.
* */
public class easy53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sumValue = nums[0], result = nums[0];

        if(nums.length == 1) return result;
        for(int i = 1 ; i < nums.length ; i++){
            sumValue = Math.max(nums[i], sumValue + nums[i]);
            result = Math.max(sumValue, result);
            System.out.println(result);
        }
        return result;
    }
}

