package infcode.test;

import java.util.Scanner;

public class test23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int sum = 0;
        for(int i = 1; i < n; i++){
            int count = i;
            sum = 0;
            while(count <= n){
                sum += count;
                if(sum == n){
                    answer++;
                    break;
                }
                count++;
            }
        }

        return answer;
    }
}
