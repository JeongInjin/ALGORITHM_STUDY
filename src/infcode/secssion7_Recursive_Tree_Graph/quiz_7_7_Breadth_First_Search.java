package infcode.secssion7_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
이진트리 순회(넓이우선탐색 : 레벨탐색) BFS : Breadth-First-Search
아래 그림과 같은 이진트리를 레벨탐색 연습하세요.
    1
   2 3
 4 5 6 7

레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
*/
public class quiz_7_7_Breadth_First_Search {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data=val;
            lt=rt=null;
        }
    }
    private Node root;

    public static void main(String[] args){
        quiz_7_7_Breadth_First_Search tree = new quiz_7_7_Breadth_First_Search();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
    public static void BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        int L = 0;
        while(!Q.isEmpty()){
            int len = Q.size();
            System.out.print(L + " : ");
            for(int i = 0; i < len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) Q.add(cur.lt);
                if(cur.rt != null) Q.add(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
}