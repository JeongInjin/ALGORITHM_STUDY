package infcode.secssion1_String;

import java.util.Scanner;

public class quiz11_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String answer = "";
        str = str.toUpperCase();
        StringBuilder sb = new StringBuilder();
        char[] c = str.toCharArray();

        int duplCount = 0;
        char nowChar = c[0];
        sb.append(c[0]);

        for(int i = 0; i < c.length; i++){
            if(nowChar == c[i]){
                duplCount++;
            }else{
                if(duplCount != 1){
                    sb.append(duplCount);
                }
                duplCount = 1;
                sb.append(c[i]);
                nowChar = c[i];
            }
        }
        if(duplCount != 1){
            sb.append(duplCount);
        }
        return sb.toString();
    }
}
