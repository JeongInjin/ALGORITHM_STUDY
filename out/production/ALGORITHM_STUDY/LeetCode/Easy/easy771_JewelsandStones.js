/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    let jewelsSetData = new Set();
    jewelsSetData = Array.from(jewels);
    let parseJewels = jewelsSetData.join("");

    let stonList = Array.from(stones);
    let sameCount = 0;
    stonList.forEach((v) =>{
        if(parseJewels.includes(v)) sameCount++;
    });
    return sameCount;
};