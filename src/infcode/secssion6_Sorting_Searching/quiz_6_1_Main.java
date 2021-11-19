package infcode.secssion6_Sorting_Searching;

import java.util.Scanner;
// selection Sort
public class quiz_6_1_Main {
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

        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int k = i + 1; k < arr.length; k++){
                if(arr[minIndex] > arr[k]) minIndex = k;
            }

            answer[i] = arr[minIndex];

            if(minIndex != i){
                swap(arr, i, minIndex);
            }
            //System.out.println(i + " 회차 " + Arrays.toString(arr));
        }
        return answer;
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
