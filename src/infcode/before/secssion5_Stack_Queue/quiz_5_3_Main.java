package infcode.before.secssion5_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class quiz_5_3_Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                arr[i][k] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i< m; i++) moves[i] = sc.nextInt();

        System.out.print(solution(n, arr, moves));
    }

    private static int solution(int n, int[][] arr, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pick : moves){
            for(int i = 0; i < n; i++){
                if(arr[i][pick-1] != 0){
                    int compare = arr[i][pick-1];
                    if(!stack.isEmpty()){
                        if(stack.peek() == compare){
                            answer ++;
                            stack.pop();
                        }else stack.push(compare);
                    }else{
                        stack.push(compare);
                    }
                    arr[i][pick-1] = 0;
                    break;
                }
            }
        }
        return answer * 2;
    }
}
