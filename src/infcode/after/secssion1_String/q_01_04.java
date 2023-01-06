package infcode.after.secssion1_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q_01_04 {
    public static void main(String[] args) {
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

    public static List<String> solution(String[] str) {
        List<String> answer = new ArrayList<>();
        for (String s : str) {
            StringBuilder sb = new StringBuilder(s);
            answer.add(sb.reverse().toString());
        }
        return answer;
    }
}


