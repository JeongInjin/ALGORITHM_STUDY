package infcode.after.secssion1_String;

import java.util.Scanner;

public class q_01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");

        for(int i = 0; i < strArr.length; i++) {
            if(answer.length() < strArr[i].length()) answer = strArr[i];
        }
        return answer;
    }
}


