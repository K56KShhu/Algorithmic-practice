package Chapter2.section1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import util.PathUtils;

/**
 * @author zkyyo
 * @since 2019-01-14 10:57
 **/
public class Insertion {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(j, j - 1); j--) {
                exch(a, j - 1, j);
            }
        }
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = new In(PathUtils.getFilePath("words3.txt")).readAllStrings();
        sort(a);
        System.out.println(isSorted(a));
        show(a);
    }
}
