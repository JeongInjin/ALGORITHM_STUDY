package LeetCode.Medium;

import java.util.HashSet;

public class medium3_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            int lt = 0, rt = 0;
            int n = s.length();

            HashSet<Character> set = new HashSet<>();

            while(rt < n){
                if(lt > rt) break;

                if(!set.contains(s.charAt(rt))){
                    set.add(s.charAt(rt++));
                    maxLength = Math.max(maxLength, rt- lt);
                    continue;
                }
                set.remove(s.charAt(lt++));
            }
            return maxLength;
        }
    }
}
