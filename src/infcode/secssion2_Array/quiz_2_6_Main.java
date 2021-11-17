package infcode.secssion2_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class quiz_2_6_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] q = new int[n];
        for(int i = 0; i < n; i++){
            q[i] = sc.nextInt();
        }
        for(int v : solution(q)){
            System.out.print(v +" ");
        }
    }
    public static int[] solution(int[] q){
        int[] answer = new int[q.length];
        int[] cloneAnswer = new int[q.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < q.length; i++){
            map.put(q[i], 0);
        }

        Integer[] clone = Arrays.stream(q).boxed().toArray(Integer[]::new);
        Arrays.sort(clone, Collections.reverseOrder());
        int count = 1;
        answer[0] = 1;
        map.put(clone[0], 1);
        for(int i = 1; i < clone.length; i++){
            if(clone[i-1] == clone[i]) answer[i] = count;
            else{
                count++;
                answer[i] = count;
            }
            map.put(clone[i], count);
        }
        for(int i = 0; i < q.length; i++){
            answer[i] = map.get(q[i]);
        }
        return answer;
    }
}
