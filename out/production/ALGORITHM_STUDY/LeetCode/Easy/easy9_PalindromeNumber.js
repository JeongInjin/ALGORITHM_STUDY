/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x < 0) return false;
    else if(x === 0) return true;

    let reversArray = [];
    reverArray = String(x).split('').reverse().join('');
    if(String(x) === reverArray) return true;
    else return false;
};