/**
 * @param {number[]} nums
 * @return {number}
 * 최소단위 일때 조심하고, for문 돌릴때 int i = 1이다잉~
 */
var maxSubArray = function(nums) {
    let sumValue = nums[0], result = nums[0];
    if(nums.length <= 0) return result;

    for(let i = 1 ; i < nums.length ; i++){
        sumValue = Math.max(nums[i], sumValue + nums[i]);
        result = Math.max(sumValue, result);
    }
    return result;
};