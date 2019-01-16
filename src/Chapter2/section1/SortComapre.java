package Chapter2.section1;

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
        double t1 = timeRandomInput("Insertion", 1000, 100000);
        double t2 = timeRandomInput("Selection", 1000, 100000);
        System.out.println("Insertion " + t1);
        System.out.println("Selection " + t2);
        System.out.println(t2 / t1);
    }
}
