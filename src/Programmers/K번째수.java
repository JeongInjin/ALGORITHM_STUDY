package Programmers;

import java.util.Arrays;
/*
* Array.copyOfRange는 몰랐던거 같은데..좋은거 배움 ㅎ
* Arrays.sort 쓰면 좀더 간단함..
* copy부분을 내가 구현해봐야겠음.
* */
public class K번째수 {
    public static void main(String[] args){
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int[] result = solution(array, commands);
        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        //숫자 자르기
        for(int i = 0 ; i < commands.length ; i++){
            int[] copyArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); // 배열 복사
            quickSort(copyArray, 0, copyArray.length -1); // 정렬
            answer[i] = copyArray[commands[i][2]-1]; // answer 답 넣기.
        }

        return answer;
    }
    //정렬시작.
    private static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);
        if(start < part-1) quickSort(arr, start, part-1);
        if(end > part) quickSort(arr, part, end);
    }
    //part 나누기.
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }
    //스왑
    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
