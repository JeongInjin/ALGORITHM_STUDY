package infcode.secssion1_String;

import java.util.Scanner;

public class quiz_1_9_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }

    private static int solution(String str) {
        if(str.length() <= 0 || str.length() > 100) return 0;
        StringBuilder answer = new StringBuilder();
        answer = new StringBuilder(str.replaceAll("[^0-9]", ""));
        while(String.valueOf(answer).startsWith("0")) answer.deleteCharAt(0);

        if(Integer.parseInt(answer.toString()) > 1000000000) return 0;
        return Integer.parseInt(answer.toString());
    }
}
