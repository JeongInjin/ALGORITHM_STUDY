package infcode.before.secssion7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
Tree 말단 노드까지의 가장 짧은 경로 - DFS ->최소 거리는 BFS 로 풀어야함. 연습용임.
아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를
구하는 프로그램을 작성하세요.
각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를
길이로 하겠습니다.
    1
   2 3
  4 5
가장 짧은 길이는 3번 노느까지의 길이인 1이다
*/
public class quiz_7_10_BFS_말단노드까지_짧은_경로 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }
    static Node root;

    public static void main(String[] args){
        quiz_7_10_BFS_말단노드까지_짧은_경로 tree = new quiz_7_10_BFS_말단노드까지_짧은_경로();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(BFS(tree.root));
    }

    private static int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                if(cur.lt == null && cur.rt == null) return L;
                if(cur.lt != null) Q.offer(cur.lt);
                if(cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        return -1;
    }

}