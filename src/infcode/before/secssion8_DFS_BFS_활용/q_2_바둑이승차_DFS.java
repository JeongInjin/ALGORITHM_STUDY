package infcode.before.secssion8_DFS_BFS_활용;

import java.util.Scanner;

/*
2. 바둑이 승차(DFS)
설명

철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.

철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.

N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.


입력
첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.

둘째 줄부터 N마리 바둑이의 무게가 주어진다.


출력
첫 번째 줄에 가장 무거운 무게를 출력한다.


예시 입력 1

259 5
81
58
42
33
61
예시 출력 1

242
* */
public class q_2_바둑이승차_DFS {
    static int answer = 0;
    static int n, total;
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        total = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = kb.nextInt();
        }
        DFS(0, 0, arr);

        System.out.println(answer);
    }

    private static void DFS(int L, int sum, int[] arr) {
        if(total < sum) return;
        if(L == n) answer = Math.max(answer, sum);
        else{
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
}
