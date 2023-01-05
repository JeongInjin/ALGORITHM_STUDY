package infcode.before.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test_1 {
    static int[] dis = {1, -1, 5};
    static int[] ch;
    static Queue<Integer> Q = new LinkedList<>();
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int start = kb.nextInt();
        int end = kb.nextInt();


        System.out.println(BFS(start, end));
    }
    public static int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
              int x = Q.poll();
              for(int k =0; k < 3; k++){
                  int nx = x + dis[k];
                  if(nx == e) return L + 1;
                  if(nx >= 1 && nx <= 10000&& ch[nx] == 0){
                      ch[nx] = 1;
                      Q.offer(nx);
                  }
              }
            }
            L++;
        }
        return 0;
    }
}
