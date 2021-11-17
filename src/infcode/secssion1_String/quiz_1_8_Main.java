package infcode.secssion1_String;

import java.util.Scanner;

public class quiz_1_8_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String answer = "NO";
        String compare = String.valueOf(new StringBuilder(str).reverse()).toUpperCase().replaceAll("[^A-Z]","");
        if(str.toUpperCase().replaceAll("[^A-Z]", "").equals(compare)) answer = "YES";
        return answer;
    }
}
