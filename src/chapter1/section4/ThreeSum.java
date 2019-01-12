package chapter1.section4;

import chapter1.util.MyUtils;
import chapter1.util.TimeCounter;
import edu.princeton.cs.algs4.In;

/**
 * @author zkyyo
 * @since 2018-08-21 13:32
 **/
public class ThreeSum {
    public static int count(int[] a) {
        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        cnt++;
                        System.out.println(cnt);
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        TimeCounter t = new TimeCounter();
        int[] a = new In(MyUtils.getFilePath("1Kints.txt")).readAllInts();
        System.out.println(count(a));
        t.end();
    }
}
