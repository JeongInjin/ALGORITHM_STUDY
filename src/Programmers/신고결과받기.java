package Programmers;

import java.util.*;
import java.util.stream.IntStream;

public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        int[] result = solution(id_list, report, k);
//        int[] result = solution(id_list2, report2, k2);
        System.out.println(Arrays.toString(result));
    }


    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new LinkedHashMap<>();
        HashMap<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            indexMap.put(id_list[i], i);
        }

        for (String v : report) {
            String[] subArray = v.split(" ");
            map.get(subArray[1]).add(subArray[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> set = map.get(id_list[i]);
            if (set.size() >= k) {
                for (String s : set) {
                    answer[indexMap.get(s)]++;
                }
            }
        }

        return answer;
    }
}