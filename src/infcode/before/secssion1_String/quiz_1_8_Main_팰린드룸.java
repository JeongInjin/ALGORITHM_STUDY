package infcode.before.secssion1_String;

import java.util.Scanner;
/*
팰린들룸
 */
public class quiz_1_8_Main_팰린드룸 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String answer = "YES";
        //String compare = String.valueOf(new StringBuilder(str).reverse()).toUpperCase().replaceAll("[^A-Z]","");
        //if(str.toUpperCase().replaceAll("[^A-Z]", "").equals(compare)) answer = "YES";

        //문자열로 넘어온 팰린더룸 체크 for를 이용함
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return "NO";
        }

        return answer;
    }
}
