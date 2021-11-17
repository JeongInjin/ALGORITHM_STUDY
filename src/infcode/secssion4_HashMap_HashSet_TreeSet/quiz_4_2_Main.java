package infcode.secssion4_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class quiz_4_2_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        System.out.print(solution(str, str2));
    }
    public static String solution(String str, String str2){
      String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Character c : str2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c) - 1);
        }
        return answer;
    }
}
