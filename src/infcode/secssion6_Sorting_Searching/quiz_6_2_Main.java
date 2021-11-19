package infcode.secssion6_Sorting_Searching;

import java.util.Scanner;

// bubble Sort
public class quiz_6_2_Main {
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
            for(int k = 0; k < arr.length - i; k++){
                if(arr[k] > arr[k+1]){
                    swap(arr, k, k+1);
                }
            }
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
