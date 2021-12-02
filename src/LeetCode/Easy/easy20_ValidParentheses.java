package LeetCode.Easy;

import java.util.Scanner;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 */
public class easy20_ValidParentheses {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //Solution solution = new Solution();
        System.out.println(Solution(s));
    }
     static boolean Solution(String s) {
         Stack<Character> stack = new Stack<>();

         char[] c = s.toCharArray();

            for(int i = 0; i < c.length; i++){
                if(c[i] == '(' || c[i] == '[' || c[i] == '(' || c[i] == '{') stack.push(c[i]);
                else{
                    if(stack.isEmpty()) return false;

                    char compareChar = c[i];
                    if(compareChar == ')'){
                        if(stack.pop() != '(') return false;
                    }else if(compareChar == ']'){
                        if(stack.pop() != '[') return false;
                    }else if(compareChar == '}'){
                        if(stack.pop() != '{') return false;
                    }
                }

         }
            return stack.isEmpty();
    }
}
