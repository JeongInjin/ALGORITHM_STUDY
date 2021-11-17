package infcode.secssion1_String;

import java.util.Scanner;
public class quiz_1_2_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(solution(str));
    }

    /*private static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        String upperStr = str.toUpperCase();

        for(int i = 0; i < str.length(); i++){
            if(upperStr.charAt(i) == str.charAt(i)){
                answer.append(Character.toString(str.charAt(i)).toLowerCase());
            }else{
                answer.append(Character.toString(str.charAt(i)).toUpperCase());
            }
        }
        return answer.toString();
    }*/
    private static String solution(String str){
        StringBuilder answer = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) answer.append(Character.toUpperCase(c));
            else answer.append(Character.toLowerCase(c));
        }
        return answer.toString();
    }
}
