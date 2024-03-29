package infcode.before.secssion7_Recursive_Tree_Graph;

/*
이진트리 순회(깊이우선탐색)
아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.
    1
   2 3
 4 5 6 7
전위순회 출력 : 1 2 4 5 3 6 7 - 부모(기준) -> 왼쪽 자식 -> 오른쪽 자식
중위순회 출력 : 4 2 5 1 6 3 7 - 왼쪽 자식(기준) -> 부모 -> 오른쪽 자식
후위순회 출력 : 4 5 2 6 7 3 1 - 왼쪽 자식(기준) -> 오른쪽 자식 -> 부모
*/

public class quiz_7_5_Main_DFS_이진트리순회 {
    static class Node{
        int data;
        Node lt, rt;
        public Node(int val) {
            data = val;
            lt = rt = null;
        }
    }
    private Node root;

    public static void main(String[] args){
        quiz_7_5_Main_DFS_이진트리순회 tree = new quiz_7_5_Main_DFS_이진트리순회();
        tree.root = new Node(1);
        tree.root. lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
    public void DFS(Node root){
        if(root == null)
            return;
        else{
            System.out.print(root.data+" "); // 전위순회 출력 : 1 2 4 5 3 6 7 - 부모(기준) -> 왼쪽 자식 -> 오른쪽 자식
            DFS(root.lt);
            //System.out.print(root.data+" "); // 중위순회 출력 : 4 2 5 1 6 3 7 - 왼쪽 자식(기준) -> 부모 -> 오른쪽 자식
            DFS(root.rt);
            //System.out.print(root.data+" "); // 후위순회 출력 : 4 5 2 6 7 3 1 - 왼쪽 자식(기준) -> 오른쪽 자식 -> 부모
        }
    }
}