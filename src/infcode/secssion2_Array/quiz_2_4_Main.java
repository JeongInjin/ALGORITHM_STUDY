package infcode.secssion2_Array;

import java.util.Scanner;

public class quiz_2_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int x :solution(n)) System.out.print(x+" ");
    }
    public static int[] solution(int n){
        int[] answer = new int[n];
        // 1 2 3 5 8 13 21
        answer[0] = 1;
        answer[1] = 1;
        for(int i = 2; i < n; i++){
            // 1 = 1 +
            answer[i] = answer[i - 2] + answer[i-1];
        }
        return answer;
    }
}
