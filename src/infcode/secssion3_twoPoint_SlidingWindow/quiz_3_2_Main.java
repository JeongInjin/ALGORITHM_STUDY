package infcode.secssion3_twoPoint_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class quiz_3_2_Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        for(int x : solution(n, m, a, b)) System.out.print(x+" ");
    }
    public static List<Integer> solution(int n, int m, int[] a, int[] b){
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(p1 < n && p2 < m){
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2]) p1++;
            else p2++;
        }
        return answer;
    }
}
