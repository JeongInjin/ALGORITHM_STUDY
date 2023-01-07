package infcode.after.secssion1_String;

import java.util.Scanner;

public class q_01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }
}


