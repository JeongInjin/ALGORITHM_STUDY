package infcode.secssion1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quiz_1_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i = 0; i < n; i++){
            str[i]=sc.next();
        }
        for(String v : solution(str)){
            System.out.println(v);
        }
    }
    public static List<String> solution(String[] str){
        List<String> answer = new ArrayList<>();
        /*for(int i = 0; i < str.length; i++){
            String[] c = str[i].split("");
            StringBuilder sb = new StringBuilder();
            for(int k = c.length; k > 0; k--){
                sb.append(c[k-1]);
            }
            answer.add(String.valueOf(sb));
        }*/
        for(String v : str){
            String temp = new StringBuilder(v).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }
}
