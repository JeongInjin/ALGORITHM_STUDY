package infcode.secssion6_Sorting_Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class quiz_6_5_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print(solution(n, arr));
    }

    public static String solution(int n, int[] arr) {
        //1번 답안
        String answer = "U";
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer v : arr){
            if(map.containsKey(v)){
                answer = "D"; break;
            }else{
                map.put(v, 1);
            }
        }

/*        //2번답안
        String answer="U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i]==arr[i+1]){
                answer="D";
                break;
            }
        }*/

        return answer;
    }
}
