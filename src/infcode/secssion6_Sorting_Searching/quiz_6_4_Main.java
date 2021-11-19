package infcode.secssion6_Sorting_Searching;

import java.util.Scanner;

// LRU
public class quiz_6_4_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cacheSize = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int x : solution(cacheSize, n, arr)) System.out.print(x+" ");
    }
    public static int[] solution(int cacheSize, int n, int[] arr){
        int[] cache = new int[cacheSize];

        for(Integer v : arr){
            int hit = -1;
            for(int i = 0; i < cacheSize; i++) if(v == cache[i]) hit = i;
            if(hit == -1){
                for(int i = cacheSize - 1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for(int i = hit; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = v;
        }
        return cache;
    }
}
