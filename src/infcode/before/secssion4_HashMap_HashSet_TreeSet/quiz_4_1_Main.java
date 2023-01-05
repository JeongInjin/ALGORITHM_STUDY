package infcode.before.secssion4_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class quiz_4_1_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(solution(n, str));
    }
    public static char solution(int n, String str){
      char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for(Character k : map.keySet()){
            if(max < map.get(k)){
                max = map.get(k);
                answer = k;
            }
        }
        return answer;
    }
}
