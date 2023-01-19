package infcode.after.secssion1_String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class q_01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long start = System.nanoTime();
        System.out.print(solution(str));
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("elapsedTime = " + elapsedTime);
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer.append(str.charAt(i));
        }
        return String.valueOf(answer);
    }

    //아래코드는 윗 코드보다 더 느림.
//    public static String solution(String str) {
//        String answer = "";
//        LinkedHashSet set = new LinkedHashSet<Character>();
//        for (char c : str.toCharArray()) {
//            set.add(c);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        set.forEach(sb::append);
//        answer = sb.toString();
//        return answer;
//    }
}


