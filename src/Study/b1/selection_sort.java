package Study.b1;

import java.util.Arrays;
/*
* 선택정렬
* 1.주어진 리스트 중에 최솟값을 찾아서
* 2.최솟값을 맨 앞자리로 교환한다.
* 3.교환한 자리를 제외하고 1, 2번을 반복한다.
* 시간복잡도가 O(N제곱) 이다.
* 버블정렬보다 약 2배정도 빠르다.
* 한 패스스루 당 교환이 1번만 일어나기때문에.
* */
public class selection_sort {
    public static void main(String[] args){
        //int[] array = {65, 55, 45, 33, 21, 56, 77, 12}; // 테스트 값
        int[] array = {3, 7, 1, 5, 4, 2, 9, 8, 6}; // 테스트 값
        selectionSort(array);
    }
    private static void selectionSort(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            int minIndex = i; // 선택할 가장 작은 수의 인덱스
            for(int k = i ; k < array.length ; k++){
                if(array[minIndex] > array[k]){ // 더 작은 값을 찾은경우 해당 인덱스를 저장한다
                    minIndex = k;
                }
            }
            if(minIndex != i){
                swapValue(array, i, minIndex);
            }
            System.out.println(i + " 회차 " + Arrays.toString(array));
        }
    }
    private static void swapValue(int[] arr, int i, int k){
        int tmp = arr[i];
        arr[i] = arr[k];
        arr[k] = tmp;
    }
}
