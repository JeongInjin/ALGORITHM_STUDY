package BOJ.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _10998 {
    public class Main {
        public static void main(String[] args) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date now = new Date();
            String formatDate = format.format(now);
            System.out.printf(formatDate);
        }
    }
}
