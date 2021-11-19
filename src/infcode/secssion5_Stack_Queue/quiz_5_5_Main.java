package infcode.secssion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class quiz_5_5_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            else{
                stack.pop();
                if(str.charAt(i-1) == ')') answer++;
                else answer += stack.size();
            }
        }
        return answer;
    }
}
