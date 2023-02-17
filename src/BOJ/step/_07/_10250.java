package BOJ.step._07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            st.nextToken();
            int num = Integer.parseInt(st.nextToken()) - 1;

            int floor = num % h + 1;
            int room = num / h + 1;
            sb.append(floor * 100 + room).append("\n");
        }
        System.out.print(sb);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int h = Integer.parseInt(st.nextToken());
//            st.nextToken();
//            int num = Integer.parseInt(st.nextToken());
//
//            int floor = num % h;
//            int room = num / h;
//            int floor_rom;
//            if (floor == 0) {
//                floor_rom = (h * 100) + room;
//            } else {
//                floor_rom = (floor * 100) + (room + 1);
//            }
//            sb.append(floor_rom).append("\n");
//        }
//        System.out.println(sb);
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(br.readLine());
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < count; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int h = Integer.parseInt(st.nextToken());
//            st.nextToken();
//            int num = Integer.parseInt(st.nextToken());
//
//            int i1 = num % h;
//            int i2 = num / h;
//            if (i1 == 0) {
//                i1 = (h * 100) + i2;
//            } else {
//                i1 = (i1 * 100) + i2 + 1;
//            }
//            sb.append(i1).append("\n");
//        }
//
//        System.out.println(sb);
//    }


}
