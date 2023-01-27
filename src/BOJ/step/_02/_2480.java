package BOJ.step._02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class _2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int[] arr = new int[3];
        int max = 0;
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        int result = 0;
        //전부다를경우
        if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
            result = 100 * max;
        } else {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int n : arr) {
                map.put(n, map.getOrDefault(n, 0)+ 1);
            }

            if (map.size() == 1) {
                result = 10_000 + (max * 1_000);
            } else {
                AtomicInteger doubleKey = new AtomicInteger();
                map.forEach((k,v) ->{ if(v == 2) doubleKey.set(k); } );
                result = 1_000 + (doubleKey.get() * 100);
            }
        }
        System.out.println(result);
    }
}
