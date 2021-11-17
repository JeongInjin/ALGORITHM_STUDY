package infcode.secssion2_Array;

import java.util.Scanner;

public class quiz_2_8_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int v : solution(arr)){
            System.out.print(v + " ");
        }
    }

    private static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 1;

        for(int i = 0; i < arr.length; i++){
            answer[i] = 1;
            for(int k = 0; k < arr.length; k++ ){
                if(k != i){
                    if(arr[i] < arr[k]) answer[i]++;
                }
            }
        }
        return answer;
    }
}
