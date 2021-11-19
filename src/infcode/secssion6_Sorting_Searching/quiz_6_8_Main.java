package infcode.secssion6_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

// BinarySearch
public class quiz_6_8_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n, arr, t));
    }
    public static int solution(int n, int[] arr, int t){
        int answer = -1;
        int mid;
        int low = 0;
        int high = n - 1;

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        while (low <= high){
            mid = (low + high) / 2;

            if(t == arr[mid]) return mid + 1;
            else if (t < arr[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return answer;
    }
}
