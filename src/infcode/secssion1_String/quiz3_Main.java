package infcode.secssion1_String;

import java.util.Scanner;

public class quiz3_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String[] strArr = str.split(" ");
        String answer = "";
        for(int i = 0; i < strArr.length; i++){
            if(answer.length() < strArr[i].length()) answer = strArr[i];
        }
        return answer;
    }
}
