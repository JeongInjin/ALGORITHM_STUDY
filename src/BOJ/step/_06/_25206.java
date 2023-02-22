package BOJ.step._06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _25206 {

    final private static Map<String, Double> subjectMap = new HashMap<>() {{
        put("A+", 4.5);
        put("A0", 4.0);
        put("B+", 3.5);
        put("B0", 3.0);
        put("C+", 2.5);
        put("C0", 2.0);
        put("D+", 1.5);
        put("D0", 1.0);
        put("F", 0.0);
    }};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double gradeSum = 0, scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            Double score = Double.valueOf(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                scoreSum += score * subjectMap.get(grade);
                gradeSum += score;
            }
        }
        if (scoreSum != 0) {
            scoreSum /= gradeSum;
        }
        System.out.println(scoreSum);

    }
}
