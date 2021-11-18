package infcode.secssion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class quiz_5_2_Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(') stack.push(c);
            else if( c== ')') stack.pop();
            else{
                if(stack.isEmpty()) answer.append(c);
            }
        }

        return answer.toString();
    }

}
