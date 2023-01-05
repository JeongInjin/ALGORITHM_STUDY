package infcode.before.secssion4_HashMap_HashSet_TreeSet;

import java.util.*;

public class quiz_4_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(solution(a, b));
    }
    public static int solution(String a, String b){
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for(Character c : b.toCharArray()) bm.put(c, bm.getOrDefault(c, 0) + 1);

        int L = b.length() - 1;

        for(int i = 0; i < L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);

        int lt = 0;
//        for(int rt=L; rt<a.length(); rt++){
//            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
//            if(am.equals(bm)) answer++;
//            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
//            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
//            lt++;
//        }
        for(int rt=L; rt<a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1);
            if(am.equals(bm)) answer++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
            lt++;
        }


        return answer;
    }
}
