package LeetCode.Medium;
/*
Given a string s, return the longest palindromic substring in s.



Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 */
public class medium5_LongestPalindromicSubstring {
    static int[][] ch;
//**********************************************
    class Solution {
        public String longestPalindrome(String s) {
            if(s.length() == 1) return s;

            String result = "";
            int maxLength = Integer.MIN_VALUE;
            ch = new int[s.length()][s.length()];

            for(int i = 0; i < s.length(); i ++){
                for(int k = 0; k < s.length(); k++){
                    int check = chCheck(s, i, k);
                    int len = k -i + 1;

                    if(check == 1){
                        if(maxLength < len){
                            maxLength = len;
                            result = s.substring(i, k + 1);
                        }
                    }
                }
            }

            return result;
        }

        public int chCheck(String s, int lt, int rt){
            if(lt >= rt) return 1;

            if(ch[lt][rt] != 0) return ch[lt][rt];

            int result = -1;
            if(s.charAt(lt) == s.charAt(rt)){
                result = chCheck(s, lt +1, rt - 1);
            }
            ch[lt][rt] = result;

            return result;
        }
    }
//**********************************************

    public static void main(String[] args){
        //풀긴 했으나, O(n^3) 이라 TimeOut 이 떨어짐.
        class Solution {
            public String longestPalindrome(String s) {
                if(s.length() == 1) return s;

                String result = "";
                int maxLength = Integer.MIN_VALUE;

                for(int i = 0; i < s.length(); i ++){
                    for(int k = 0; k < s.length(); k++){
                        boolean flag = true;
                        int len = k -i + 1;
                        int lt = i;
                        int rt = k;

                        while(lt < rt){
                            if(s.charAt(lt) != s.charAt(rt)){
                                flag = false;
                                break;
                            }
                            lt++;
                            rt--;
                        }
                        if(flag){
                            if(maxLength < len){
                                maxLength = len;
                                result = s.substring(i, k + 1);
                            }
                        }
                    }
                }

                return result;
            }
        }
    }

}
