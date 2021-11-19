package infcode.secssion5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class quiz_5_7_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String required = sc.next();
        String subject = sc.next();

        System.out.print(solution(required, subject));
    }

    private static String solution(String required, String subject) {
        String answer = "YES";
        Queue<Character> required_queue = new LinkedList<>();
        for(Character c : required.toCharArray()) required_queue.offer(c);
        for(Character c : subject.toCharArray()){
            if(required_queue.contains(c)){
                if(c != required_queue.poll()) return "NO";
            }
        }

        if(!required_queue.isEmpty()) return "NO";
        return answer;
    }
}
