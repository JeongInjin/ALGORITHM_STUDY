package infcode.test;

import java.util.Arrays;

public class test15 {
    public static void main(String[] args){
        int[] arr = {7,3,4,6,8,1,5,2}; // 테스트 값
        System.out.println(" heapSort bottom-Up 정렬전 " + Arrays.toString(arr));
        heapSort_bottom_up(arr);
        System.out.println(" heapSort bottom-Up 정렬후 " + Arrays.toString(arr));
    }

    private static void heapSort_bottom_up(int[] arr) {
        int size = arr.length;
        if(size < 2) return;

        /*
        left-child-node : n * 2 + 1
        right-child-node : n * 2 + 2
        parent-node : (n - 1) / 2;
         */

        int parentNode = ((size - 1) -1) / 2;

        for(int i = parentNode; i >= 0; i--){
            heapify_maxHeap(arr, i, size-1);
        }

        for(int i = size -1; i >= 0; i--){
            swap(arr, 0, i);
            heapify_maxHeap(arr, 0, i-1);
        }
    }

    private static void heapify_maxHeap(int[]arr, int parentIndex, int lastIndex){
        int leftChildIndex;
        int rightChildIndex;
        int largestIndex;

        while((parentIndex * 2) + 1 <= lastIndex){
            leftChildIndex = (parentIndex * 2) + 1;
            rightChildIndex = (parentIndex * 2) + 2;
            largestIndex = parentIndex;

            if(arr[leftChildIndex] > arr[largestIndex]){
                largestIndex = leftChildIndex;
            }
            if(rightChildIndex <= lastIndex && arr[rightChildIndex] > arr[largestIndex]){
                largestIndex = rightChildIndex;
            }

            if(largestIndex != parentIndex){
                swap(arr, parentIndex, largestIndex);
                parentIndex = largestIndex;
            }else{
                return;
            }
        }
    }

    private static void swap(int[] arr, int i, int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
