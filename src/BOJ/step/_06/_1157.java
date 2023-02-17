package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] arr = br.readLine().toUpperCase().split("");
//        if (arr.length == 1) {
//            System.out.println(arr[0]);
//            return;
//        }
//
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            String str = arr[i];
//            map.put(str, map.getOrDefault(str, 0) + 1);
//        }
//
//        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
//        Collections.sort(list, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
//        if (list.get(0).getValue().equals(list.get(1).getValue())) {
//            System.out.println("?");
//        } else {
//            System.out.println(list.get(0).getKey());
//        }
//    }

    /*
        BufferedReader를 이용하여 입력으로 주어지는 문자열을 읽어옵니다.
        입력 문자열을 모두 대문자로 변환하여 s 변수에 저장합니다.
        알파벳 등장 횟수를 저장하기 위한 길이가 26인 int 배열 count를 선언합니다.
        가장 많이 등장한 알파벳의 등장 횟수를 저장하기 위한 변수 max를 0으로 초기화합니다.
        가장 많이 등장한 알파벳을 저장하기 위한 변수 result를 '?'로 초기화합니다.
        문자열 s의 각 문자를 반복하면서, 해당 문자가 알파벳이면 count 배열에서 해당 알파벳의 인덱스에 해당하는 요소를 1 증가시킵니다.
        이때, count 배열에서 해당 알파벳의 인덱스에 해당하는 요소의 값이 max보다 크다면, max를 해당 값으로 갱신하고, result를 해당 알파벳으로 설정합니다.
        만약 count 배열에서 해당 알파벳의 인덱스에 해당하는 요소의 값이 max와 같다면, result를 '?'로 설정합니다.
        가장 많이 등장한 알파벳인 result를 출력합니다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase(); // 대문자로 변환

        int[] count = new int[26]; // 알파벳 등장 횟수 저장할 배열
        int max = 0; // 가장 많이 등장한 알파벳의 등장 횟수
        char result = '?'; // 가장 많이 등장한 알파벳

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'A']++; // 알파벳 등장 횟수 증가

            if (max < count[c - 'A']) { // 최대 등장 횟수 갱신
                max = count[c - 'A'];
                result = c;
            } else if (max == count[c - 'A']) { // 최대 등장 횟수가 같은 경우
                result = '?';
            }
        }

        System.out.println(result);
    }
}
