package infcode.before.secssion1_String;

import java.util.Scanner;

public class quiz_1_5_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s);
        return answer;
    }

}
