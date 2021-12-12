package Test;

import java.util.*;
import java.util.stream.Stream;

/*
문제 #1
유저에게 추천할 코믹 작품 목록을 추천시스템으로부터 장르별로 받아왔다고 가정합니다.
각 장르별 추천 작품들은 아래와 같다고 할 때,
- 스포츠 : s1, s2, s3
- 개그: g1, g2
- 판타지: f1, f2, f3
이 총 8개의 추천 작품들을 장르 순서가 서로 겹치지 않게 나열해서 보여주려고 합니다.
예를 들어, 결과가 s1, g1, f1, s2, g2, f2, s3, f3 이렇게 다음 추천 작품의 장르가 바로 직전
추천 작품의 장르와 다르게 골고루 나오게 하고 싶습니다.
(s1, s2와 같이 동일 장르의 두 작품이 연달아 나오지 않아야 합니다.)
이 문제를 실행할 수 있는 코드를 작성해주세요.
# 예제 입력 1
sports,s1,s2,s3
gag,g1,g2
fantasy,f1,f2,f3
# 결과 1
s1,g1,f1,s2,g2,f2,s3,f3
# 예제 입력 2
sports,s1,s2,s3
gag,g1,g2
fantasy,f1,f2,f3,f4
# 결과 2
f1,s1,g1,f2,s2,g2,f3,s3,f4
 */
/*
풀이 : Scanner 로 입력받은 배열을 Recommend 클래스에 담아, compareTo로 커스텀한 소팅 으로 정렬후
순서대로 for 문을 돌며 result 객체에 담아 반환합니다.
 */
public class Lezhin {
    public static void main(String[] args){
        String[] recommend = new String[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            recommend[i] = String.valueOf(sc.nextLine());
        }

        System.out.println(solution(recommend));
    }

    private static String solution(String[] recommend) {
        List<Recommend> listSort = new ArrayList<>();
        for(int i = 0; i < recommend.length; i++){
            String name =  recommend[i].split(",")[0]; //문자열 입력 후, ',' 로 입력받은 값 자르기
            listSort.add(new Recommend(name, recommend[i]));
        }
        Collections.sort(listSort);

        //장르를 가지고 있을 문자열
        List<String> sports = new ArrayList<>();
        List<String> gag = new ArrayList<>();
        List<String> fantasy = new ArrayList<>();

        //반복문의 갯수찾기 ( 가장많은 index 를 가진 arr 기준 )
        int maxCount = listSort.get(0).lengthCount;
        int sumCount = sports.size() + gag.size() + fantasy.size();

        for(int i = 0; i < listSort.size(); i++){
            sumCount += listSort.get(i).lengthCount- 1;
        }

        String[] resultArr = new String[sumCount]; // 장르 갯수만큼 제외시킨 배열 선언
        int addCount = 0;
        for(int i = 0; i < maxCount; i++){
            for(int k = 0; k < recommend.length; k ++){
                String[] splitArr = listSort.get(k).Strings.split(",");
                if(i < listSort.get(k).lengthCount - 1) resultArr[addCount++] = splitArr[i+1];
            }
        }

        String result = String.join(",", resultArr);
        return result;
    }
    static class Recommend implements Comparable<Recommend>{
        private String name;
        private String Strings;
        private int lengthCount;

        public Recommend(String name, String s) {
            this.name = name;
            this.Strings = s;
            this.lengthCount =  this.Strings.split(",").length;
        }

        @Override
        public int compareTo(Recommend o) {
            if(o.lengthCount < lengthCount) return -1;
            else return 1;
        }
    }
}
