/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var licenseKeyFormatting = function(s, k) {
    let result = s.toUpperCase().replaceAll('-', '');
    let charAtCount = 0;

    for(let i = result.length ; i >= 0 ; i--){
        if(charAtCount == k && i !== 0){
            charAtCount = 0;
            result = insertAt(result, i, '-');
        }
        charAtCount++;
    }
    return result;
};

const insertAt = (v, i, k) => {
    return v.slice(0, i) + k + v.slice(i);
}