package infcode.before.secssion7_Recursive_Tree_Graph;

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
public class quiz_7_9_DFS_말단노드까지_짧은_경로_X {
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
        quiz_7_9_DFS_말단노드까지_짧은_경로_X tree = new quiz_7_9_DFS_말단노드까지_짧은_경로_X();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        System.out.println(DFS(0, tree.root));
    }

    private static int DFS(int L, Node root) {
        if(root.lt == null && root.rt == null) return L;

        return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

}