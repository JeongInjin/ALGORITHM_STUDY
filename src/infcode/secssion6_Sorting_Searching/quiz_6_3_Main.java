package infcode.secssion6_Sorting_Searching;

import java.util.Scanner;

// insertion Sort
public class quiz_6_3_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : solution(arr))
        System.out.print(x +" ");
    }
    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length];

        for(int i = 1; i < arr.length; i++){
            int stdValue = arr[i];
            int compareIndex = i - 1;

            while(compareIndex >= 0 && stdValue <arr[compareIndex]){
                arr[compareIndex + 1] = arr[compareIndex];
                compareIndex--;
            }
            arr[compareIndex + 1] = stdValue;

            //System.out.println(i + " 회차 " + Arrays.toString(arr));
        }
        for(int i = 0; i < arr.length; i++) answer[i] = arr[i];
        return answer;
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
