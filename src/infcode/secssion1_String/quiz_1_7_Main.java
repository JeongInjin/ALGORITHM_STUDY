package infcode.secssion1_String;

import java.util.Scanner;

public class quiz_1_7_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String answer="NO";
        String tmp=new StringBuilder(str).reverse().toString();
        //equalsIgnoreCase - between upper and lower not compare character
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }
//    public static String solution(String str){
//        String answer = "YES";
//        if(str.length() == 1) return answer;
//
//        str = str.toUpperCase();
//        char[] s = str.toCharArray();
//
//        int i = 0;
//        int k = s.length-1;
//        while(i <= k){
//            if(s[i] != s[k]){
//                answer = "NO";
//                return answer;
//            }
//            i++;
//            k--;
//        }
//        return answer;
//    }
}
