package infcode.secssion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class quiz_5_1_Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

    private static String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(') stack.push(c);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";

        return answer;
    }

}
