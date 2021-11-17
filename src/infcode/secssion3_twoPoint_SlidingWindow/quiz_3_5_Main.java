package infcode.secssion3_twoPoint_SlidingWindow;

import java.util.Scanner;

public class quiz_3_5_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(solution(n));
    }
    public static int solution(int n){
        int answer = 0;
        int sum = 0;
        for(int i = 1; i < n; i++){
            int count = i;
            sum = 0;
            while(count <= n){
                sum += count;
                if(sum == n) {
                    answer++;
                    break;
                }
                count++;
            }
        }

        return answer;
    }
}
