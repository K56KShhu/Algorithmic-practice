package Chapter2.section1;

import Chapter2.section2.Merge;
import Chapter2.section2.MergeBU;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author zkyyo
 * @since 2019-01-14 16:08
 **/
public class SortComapre {
    public static double time(String alg, Comparable[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if (alg.equals("Shellsoet")) {
            Shellsort.sort(a);
        }
        if (alg.equals("Merge")) {
            Merge.sort(a);
        }
        if (alg.equals("MergeBU")) {
            MergeBU.sort(a);
        }
        return timer.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 1000;
        int t = 100000;
        double t1 = timeRandomInput("Insertion", n, t);
        double t2 = timeRandomInput("Selection", n, t);
        double t3 = timeRandomInput("Shellsort", n, t);
        double t4 = timeRandomInput("Merge", n, t);
        double t5 = timeRandomInput("MergeBU", n, t);
        System.out.println("Insertion " + t1);
        System.out.println("Selection " + t2);
        System.out.println("Shellsort " + t3);
        System.out.println("Merge     " + t4);
        System.out.println("MergeBU   " + t5);
        System.out.println(t2 / t1);
    }
}
