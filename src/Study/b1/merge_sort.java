package Study.b1;

import java.util.Arrays;

/*
* O(n log n)
* 함수를 호출할때 마다 절반씩 잘라 재귀적으로 맨 끝 젤 작은조각부터 병합해서 머지하면서 정렬해 나간다.
* 별도의 공간을 사용해야한다.
* 일단 반으로 나누고 나중에 합쳐서 정렬
* */
public class merge_sort {
    public static void main(String[] args){
        int[] arr = {7,4,2,8,3,5,1,6,10,9}; // 테스트 값
        System.out.println(" 정렬전 " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(" 정렬후 " + Arrays.toString(arr));
    }
    private static void mergeSort(int[] arr){
        int[] tmp = new int[arr.length]; // 배열의 크기만큼 임시저장소를 생성한다.
        mergeSort(arr, tmp, 0, arr.length - 1);
    }
    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        // 크기가 1보다 큰 경우
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid + 1, end);
            merge(arr, tmp, start, mid, end);
        }
    }
    //두개로 나뉘어져 있는 배열방을 병합해준다.
    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
        //임시저장소에 배열 복사
        for(int i = start ; i <= end ; i ++){
            tmp[i] = arr[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        int index = start;
        while(part1 <= mid && part2 <= end){
            if(tmp[part1] <= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            }else{
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        //남은 데이터도 삽입
        for(int i = 0 ; i <= mid - part1 ; i++){
            arr[index + i] = tmp[part1 + i];
        }
    }
}
