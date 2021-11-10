package Study.b1;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
* 힙구조 성질
* 1.왼쪽 자식 노드 인덱스 = 부모 노드 인덱스 X 2 + 1
* 2.오른쪽 자식 노드 인덱스 = 부모 노드 인덱스 X 2 + 2
* 3.부모 노드 인덱스 = (자식 인덱스 - 1) / 2
* */

/*
* int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

* int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

* String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

* String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
*/

public class heapSort {
    public static void main(String[] args){
        int[] arr = {3,4,1,5,2}; // 테스트 값
        priorityHeapSort(arr); // PriorityQueue 를 이용한.

        System.out.println(" 정렬전 " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println(" 정렬후 " + Arrays.toString(arr));
    }

    //콜렉션 프레임워크를 이용한 힙정렬
    private static void priorityHeapSort(int[] arr) {
        System.out.println(" priorityHeapSort 정렬전 " + Arrays.toString(arr));
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //배열을 힙으로 만든다.
        for(int i = 0 ; i < arr.length ; i++){
            heap.add(arr[i]);
        }
        //힙에서 우선순위가 가장 높은 원소(root 노드)를 하나씩 뽑는다.
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = heap.poll();
        }
        System.out.println(" PriorityQueue큐 정렬후 " + Arrays.toString(newArr));
    }

    private static void heapSort(int[] arr){
        //size가 0 또는 1일경우 return
        if(arr.length < 2) return;

        int n = arr.length;

        for(int i = n/2-1; i >= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n-1; i > 0 ; i--){
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

// 단순히 일반 배열을 힙으로 구성하는 역할을 한다.
// 자식노드와 부모노드를 비교
// n/2-1 부터 0까지 인덱스가 도는 이유는 부모 노드의 인덱스를 기준으로
// 왼쪽 자식노드(n*2+1), 오른쪽 자식노드(n*2+2) 이기 때문이다.
//부모노드 -> (자식노드인덱스 -1) / 2
    private static void heapify(int[] arr , int n, int i) {
        int p = i;
        int l = i * 2 + 1;
        int r = i * 2 + 2;

        //left childNode
        //왼쪽자식노드가 인덱스를 안 벗어났으며, 왼쪽 자식노드가 자신의 노드보다 클경우
        //현재 노드와 자식노드와 변경해준다.
        if(l < n && arr[p] < arr[l]){
            p = l;
        }
        //right childNode
        if(r < n && arr[p] < arr[r]){
            p = r;
        }
        if(i != p){
            swap(arr, i, p);
            heapify(arr, n, p);
        }
    }

    private static void swap(int[] heap, int i, int k) {
        int temp = heap[i];
        heap[i] = heap[k];
        heap[k] = temp;
    }
}
