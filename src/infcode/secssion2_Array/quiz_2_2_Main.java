package infcode.secssion2_Array;

import java.util.Scanner;

public class quiz_2_2_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int[] q = new int[n];
        for (int i = 0; i < n; i++){
            q[i] = sc.nextInt();
        }
        System.out.print(solution(q));
    }
    public static int solution(int[] q){
        int answer = 1;
        int compare = q[0];
        for(int i = 0; i < q.length - 1; i++){
            if(compare < q[i+1]) {
                answer++;
                compare = q[i+1];
            }
        }
        return answer;
    }
}
