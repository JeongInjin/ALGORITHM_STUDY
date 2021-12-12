package Study.b1.정렬;

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

public class             heapSort {
    public static void main(String[] args){
        int[] arr = {3,4,1,5,2}; // 테스트 값
        priorityHeapSort(arr); // PriorityQueue 를 이용한.

        System.out.println(" 정렬전 " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println(" 정렬후 " + Arrays.toString(arr));

        int[] arr_bottomUp = {7,3,4,6,8,1,5,2}; // 테스트 값
        System.out.println(" heapSort bottom-Up 정렬전 " + Arrays.toString(arr_bottomUp));
        heapSort_bottom_up(arr_bottomUp);
        System.out.println(" heapSort bottom-Up 정렬후 " + Arrays.toString(arr_bottomUp));
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

    /*Top-Bottom 방식은 마지막에 재귀를 또다시 호출하기 때문에 비효율적임.*/
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


    // 상향식 힙정렬
    private static void heapSort_bottom_up(int[] arr){
        int size = arr.length;
        if(size < 2) return;

        /*
         * left child node = index * 2 + 1
         * right child node = index * 2 + 2
         * parent node = (index - 1) / 2
         */
        //가장 마지막 요소의 부모 인덱스
        int parentIndex = ((size -1) -1) / 2;
        //max heap
        for(int i = parentIndex; i >= 0; i--){
            heapify_maxHeap(arr, i, size -1);
        }

        for(int i = size-1; i >= 0; i--){
            swap(arr, 0, i);
            heapify_maxHeap(arr, 0, i - 1);
        }
    }
    private static void heapify_maxHeap(int[] arr, int parentIndex, int lastIndex){
        int leftChildindex;
        int rightChildindex;
        int largestIndex;
        /*
        현재 부모 인덱스의 자식 노드 인덱스가
        마지막 엔득스를 넘지 않을 때 까지 반복한다.
        이 때 왼쪽 자식 노드를 기준으로 범위를 검사하게 되면
        마지막 부모 인덱스가 왼쪽 자식만 갖고 있을 경우
        왼쪽 자식노드와는 비교 및 교환을 할 수 없기 때문이다.
         */
        while ((parentIndex * 2) + 1 <= lastIndex){
            leftChildindex = (parentIndex * 2) + 1;
            rightChildindex = (parentIndex * 2) + 2;
            largestIndex = parentIndex;

            /*
             * left child node와 비교
             * (범위는 while문에서 검사했으므로 별도 검사 필요 없음)
             */
            if(arr[leftChildindex] > arr[largestIndex]){
                largestIndex = leftChildindex;
            }
            /*
             * right child node와 비교
             * right child node는 범위를 검사해주어야한다.
             */
            if(rightChildindex <= lastIndex && arr[rightChildindex] > arr[largestIndex]){
                largestIndex = rightChildindex;
            }
            /*
             * 교환이 발생했을 경우 두 원소를 교체 한 후
             * 교환이 된 자식노드를 부모 노드가 되도록 교체한다.
             */
            if(largestIndex != parentIndex){
                swap(arr, parentIndex, largestIndex);
                parentIndex = largestIndex;
            }else{
                return;
            }

        }
    }
}
