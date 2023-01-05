package infcode.after.secssion1_String;

import java.util.Scanner;

public class q_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        System.out.print(solution(str, t));
    }

    public static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char c : str.toCharArray()) {
            if(c == t) answer++;
        }
        return answer;
    }
}


