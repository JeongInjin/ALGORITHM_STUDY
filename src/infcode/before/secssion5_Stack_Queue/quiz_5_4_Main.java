package infcode.before.secssion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class quiz_5_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.print(solution(str));
    }

    private static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(Character.isDigit(c) ) stack.push(c - 48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt + rt);
                else if(c == '-') stack.push(lt - rt);
                else if(c == '*') stack.push(lt * rt);
                else if(c == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
}
