package infcode.secssion6_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

// 결정알고리즘 - 최대
public class quiz_6_10_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(solution(n, t, arr));
    }
    public static int solution(int n, int t, int[] arr){
        int answer = 0;
        Arrays.sort(arr);

        int lt =  1;
        int rt = arr[n - 1];

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= t){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
            }
        }
        return answer;
    }
    public static int count(int[] arr, int dist){
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - ep >= dist){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
