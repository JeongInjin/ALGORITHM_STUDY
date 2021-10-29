package Study.s1;


import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bfs2{
    static int N, M;
    static int nodeList[][];
    static boolean visit[];
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        nodeList = new int[N+1][M+1];
        visit = new boolean[N+1];

        for(int i = 0 ; i < M ; i++){
          st = new StringTokenizer(br.readLine());
          int start = Integer.parseInt(st.nextToken());
          int end = Integer.parseInt(st.nextToken());
          nodeList[start][end] = nodeList[end][start] = 1;
        }

        System.out.println("시작점 선택해주세요. => ");
        Scanner sc = new Scanner(System.in);
        int bfsStart = sc.nextInt();
        bfs2(bfsStart);
    }
    static void bfs(int point){
        Queue<Integer> q = new LinkedList<>();
        q.offer(point);
        visit[point] = true;

        while(!q.isEmpty()){
            int target = q.poll();
            System.out.println(target + " ");
            for(int i = 1 ; i <= N ; i++){
                if(nodeList[target][i] == 1 && visit[i] == false){
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }

    static void bfs2(int point){
        Queue<Integer> q = new LinkedList<>();
        q.offer(point);
        visit[point] = true;
        while (!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");
            for(int i = 1 ; i <= N ; i++){
                if(nodeList[x][i] == 1 && visit[i] == false){
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}