package infcode.secssion6_Sorting_Searching;

import java.util.Scanner;

// insertion Sort
public class quiz_6_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int x : solution(s, n, arr)) System.out.print(x+" ");
    }
    public static int[] solution(int s, int n, int[] arr){
        int[] answer = new int[arr.length];
        return answer;
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
