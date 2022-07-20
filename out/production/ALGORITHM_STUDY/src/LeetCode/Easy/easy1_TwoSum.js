/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * 오..이중 for문 사용했는데..map을 이용해서도 가능하구나..
 * 역시  배워야해 신박하다.
 */
const easy1_TwoSum = function(nums, target) {
    const valueMap = new Map();

    for (let i = 0; i < nums.length; i++) {
        const  seachValue = target - nums[i];
        if(valueMap.get(seachValue) !== undefined){
            console.log("true :",valueMap.get(seachValue))
            return [valueMap.get(seachValue), i];
        }else{
            valueMap.set(nums[i], i);
        }
    }
};