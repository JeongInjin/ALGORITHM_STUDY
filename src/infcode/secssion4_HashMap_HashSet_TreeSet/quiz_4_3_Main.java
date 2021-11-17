package infcode.secssion4_HashMap_HashSet_TreeSet;

import java.util.*;

public class quiz_4_3_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(Integer v : solution(n, k, arr)) System.out.print(v + " ");
    }
    public static List<Integer> solution(int n, int q, int[] arr){
      List<Integer> answer = new ArrayList<>();
      Map<Integer, Integer> map = new HashMap<>();

      for(int i = 0; i < q - 1; i++){
          map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
      }

      int lt = 0;
      for(int rt = q - 1; rt < n; rt++){
          map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
          answer.add(map.size());
          map.put(arr[lt], map.get(arr[lt])-1);
          if(map.get(arr[lt]) == 0 ) map.remove(arr[lt]);

          lt++;
      }
      return answer;
    }
}
