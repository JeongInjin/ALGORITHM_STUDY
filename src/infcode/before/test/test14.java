package infcode.before.test;

import java.util.Arrays;

public class test14 {
    public static void main(String[] args){
        int[] arr = {7,4,2,8,3,5,1,6,10,9}; // 테스트 값
        System.out.println(" 정렬전 " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(" 정렬후 " + Arrays.toString(arr));
    }
    private static void quickSort(int[] arr, int start, int end){
        int part = partition(arr, start, end);
        if(start < part - 1){
            quickSort(arr, start, part - 1);
        }
        if(part < end){
            quickSort(arr, part, end);
        }
    }
    private static int partition(int[] arr, int start, int end){
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
