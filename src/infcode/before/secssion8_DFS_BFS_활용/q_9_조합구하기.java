package infcode.before.secssion8_DFS_BFS_활용;
/*
조합 구하기
1부터 N까지 번호가 적힌 구슬이 있습니다. 이 중 M개를 뽑는 방법의 수를 출력하는 프로그
램을 작성하세요.
▣ 입력설명
첫 번째 줄에 자연수 N(3<=N<=10)과 M(2<=M<=N) 이 주어집니다.
▣ 출력설명
첫 번째 줄에 결과를 출력합니다.
출력순서는 사전순으로 오름차순으로 출력합니다.
▣ 입력예제 1
4 2
▣ 출력예제 1
1 2
1 3
1 4
2 3
2 4
3 4
 */
import java.util.Scanner;
public class q_9_조합구하기 {
    static int[] combi;
    static int n, m;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        DFS(0, 1);
    }

    private static void DFS(int L, int s) {
        if(L == m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i = s; i <= n; i++){
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }
}
