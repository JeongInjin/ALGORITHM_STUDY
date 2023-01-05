package infcode.before.secssion1_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class quiz_1_6_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
    public static String solution(String str){
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char[] s = str.toCharArray();
//        for(int i = 0; i < s.length; i++){
//            int compareCount = map.getOrDefault(String.valueOf(s[i]), 0);
//            if(compareCount == 0) sb.append(s[i]);
//            map.put(String.valueOf(s[i]), map.getOrDefault(s[i], 1));
//        }
//        answer = sb.toString();
        for(int i =0; i < s.length; i++){
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}
