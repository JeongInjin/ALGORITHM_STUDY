package Study.b1;

import java.util.Arrays;

/*
* 퀵정렬
* 기준점을 잡고(보통 중간) 기준점으로 부터 왼쪽 과 오른쪽을 나누어 스왑할 값을 찾는다
* 왼쪽기준 : pivot값 보다 큰값(왼쪽에 있다는것은 기준보다 작아야한다.) start++
* 오른쪽기준 : pivot값 보다 작은값(오른쪽에 있다는것은 기준보다 커야한다.) end--
* 찾은경우 서로 스왑해준다.
* return 된 start 값 = part 값으로, start & end 값과의 차이가 있다면 반복해준다.
* */
public class quick_sort {
    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);
        if(start < part -1){
            quickSort(arr, start, part - 1);
        }
        if(part < end){
            quickSort(arr, part, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end){
            while (arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        System.out.println("start는 " + start +" end는 " + end +" partition 정렬후 " + Arrays.toString(arr));
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
    }

    public static void main(String[] args){
        int[] arr = {7,4,2,8,3,5,1,6,10,9}; // 테스트 값
        System.out.println(" 정렬전 " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(" 정렬후 " + Arrays.toString(arr));


    }
}
