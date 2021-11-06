package Study.b1;

import java.util.Random;
/*
* 이진탐색
* 조건 : 모든 원소는 정렬 되어 있어야함.(필수)
* 원소의 길이의 중앙을 선택하여 업&다운 게임하듯이 타켓 원소를 찾는다
* 시간복잡도는 B(log n)
* 재귀를 이용하는 방법도 있다.
* 선형검색(Linear Search) - 다른이름으로 순차검색(Sequential Search)
* ㄴ 데이터가 모인 집합(배열 등)을 처음부터 끝까지 하나씩 순서대로 비교하는 알고리즘
* 이진검색(Binary Search) - 다른이름으로는 이분검색(반으로 나누어거 연산)
* ㄴ 중간값 부터 탐색하는 검색 구조
* 선형검색은 링크드리스트에서 자주 쓰이는 반면 이진검색은 트리구조에서 자주 쓰이는 형식.
* */
public class binary_search {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; // 테스트 값
        int targetValue = new Random().nextInt(19) + 1; // 찾을 값

        System.out.print(targetValue + "  :  " +binarySearch(array, targetValue)); // 호출
    }

    private static int binarySearch(int[] array, int targetValue) {
        int mid; // 중앙값
        int low = 0; //찾을 수 중에 가장 작은 값
        int high = array.length - 1; // 찾을 수 중에 가장 큰 수
        int searchCount = 0; // 몇번만에 찾았나를 확인해 보기위해..
        while(low <= high){
            mid = (low + high) / 2;

            if(targetValue == array[mid]){ // 찾았을 경우
                System.out.println("searchCount   :   " + searchCount);
                return mid;
            }else if(targetValue < array[mid]){ // 찾을 값이 검색한 값보다 작을경우
                high = mid - 1; // 찾을 값이 현재 값 보다 작기 때문에 현재의 인덱스보다 -1로 처리한다.
            }else{
                low = mid + 1; // 찾을 값이 현재 값 보다 크기 때문에 가장 작은 수를 현재의 인덱스 +1 로 처리한다.
            }
            searchCount++;
        }

        return -1; //false
    }
}
