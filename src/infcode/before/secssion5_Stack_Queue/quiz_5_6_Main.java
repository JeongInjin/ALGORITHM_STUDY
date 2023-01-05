package infcode.before.secssion5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class quiz_5_6_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        System.out.print(solution(n, t));
    }

    private static int solution(int n, int t) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) queue.offer(i);

        while(!queue.isEmpty()){
            for(int i = 1; i < t; i++) queue.offer(queue.poll());
            queue.poll();
            if(queue.size() == 1) answer = queue.poll();
        }

        return answer;
    }
}
