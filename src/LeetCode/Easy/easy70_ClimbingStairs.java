package LeetCode.Easy;

import java.util.Scanner;

public class easy70_ClimbingStairs {
    static int[] dy;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(Solution.climbStairs(n));
    }
    static class Solution {
        public static int climbStairs(int n) {
            int answer;
            if(n == 1 || n == 2) return dy[n];
            dy[1] = 1;
            dy[2] = 2;



            for(int i = 3; i <= n; i++){
                dy[i] = dy[i - 2] + dy[i - 1];
            }
            answer = dy[n];

            return answer;
        }
    }
}


/*
class Solution {
    public int climbStairs(int n) {
        int[] dy = new int[n+1];
        if(n == 1 || n == 2) return n;
        dy[1] = 1;
        dy[2] = 2;

        int answer;

        for(int i = 3; i <= n; i++){
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        answer = dy[n];

        return answer;
    }
}
*/
