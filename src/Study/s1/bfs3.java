package Study.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bfs3 {
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

        for (int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            nodeList[start][end] = nodeList[end][start] = 1;
        }

        System.out.println("시작점을 선택해주세요. ->");
        Scanner sc = new Scanner(System.in);
        int bfsStart = sc.nextInt();
        bfs3(bfsStart);
    }

    public static void bfs3(int point){
        Queue<Integer> q = new LinkedList<>();
        q.offer(point);
        visit[point] = true;

        while (!q.isEmpty()){
            int target = q.poll();
            for(int i = 0 ; i <= N ; i++){
                if(nodeList[point][i] == 1 && visit[point] == false){
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }
}
