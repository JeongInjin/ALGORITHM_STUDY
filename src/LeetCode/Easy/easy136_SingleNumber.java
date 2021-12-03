package LeetCode.Easy;

import java.util.HashMap;

public class easy136_SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int answer = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();

            for(Integer v : nums){
                hm.put(v, hm.getOrDefault(v, 0) + 1);
            }
            for(Integer v : hm.keySet()){
                if(hm.get(v) == 1) answer =  v;
            }

            return answer;
        }
    }
}

/*
크..for를 2번 돌리는게 마음에 안들어 찾아봤는데..
역시 똑똑한 사람이 너무나 많은 세상이다 행복하네

https://yenny-zzang.tistory.com/28

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums.length == 1)
            return nums[0];

        for(int i=0; i<nums.length-1; i=i+2) {
            if(nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
 */
