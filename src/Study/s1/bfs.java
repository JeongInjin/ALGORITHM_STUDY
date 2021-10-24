package Study.s1;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class bfs {

    static int nV; //정점의 수
    static int nE; //간선의 수
    static int[][] arr2d; //정점간 연결관계 저장 배열
    static boolean [] visit; //방문한 정점 체크 배열

    public static void bfs(int n){
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        visit[n] = true;

        while(!q.isEmpty()){
            //큐에 있는 모든 정점에 방문할때까지 반복
            int temp = q.poll(); //큐에 있는 방문한 정점을 하나 빼줌
            System.out.println("방문 => " + temp);
            for(int i = 1 ; i <= nV ; i++){
                if(arr2d[temp][i]  == 1 && visit[i] == false){ //현재 정점에서 다음 i 정점과 연결되었는지 확인
                    q.offer(i);
                    visit[i] = true; //방문 체크
                }
            }
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정점, 간선 입력 =>");
        nV = sc.nextInt(); // 정점
        nE = sc.nextInt(); // 간선

        arr2d = new int[nV+1][nE+1]; // 1부터 비교할려고
        visit = new boolean[nV+1];

        for(int i = 0 ; i < nE ; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr2d[start][end] = arr2d[end][start] = 1;
        }

        System.out.println("탐색시작위치 =>");
        int start = sc.nextInt();
        bfs(start);
    }
}
