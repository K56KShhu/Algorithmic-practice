package Chapter2.section2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import util.PathUtils;

/**
 * @author zkyyo
 * @since 2019-01-19 21:41
 **/
public class MergeBU {
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        int N = a.length;
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int lo = 0; lo < N - sz; lo += sz + sz) {
                merge(a, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
            }
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int left = lo;
        int right = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (left >= mid + 1) {
                a[i] = aux[right++];
            } else if (right >= hi + 1) {
                a[i] = aux[left++];
            } else if (less(aux[left], aux[right])) {
                a[i] = aux[left++];
            } else {
                a[i] = aux[right++];
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
