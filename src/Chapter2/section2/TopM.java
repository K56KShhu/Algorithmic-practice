package Chapter2.section2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.MinPQ;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;
import util.PathUtils;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author zkyyo
 * @since 2019-01-27 20:53
 **/
public class TopM {
    public static void main(String[] args) {
        String a = new In(PathUtils.getFilePath("tinyBatch.txt")).readLine();
        System.out.println(a);
        MaxPQ<Transaction> pq = new MaxPQ<>(5);
//        for (String s :a) {
//            pq.insert(new Transaction(s));
//            if (pq.size() > 5) {
//                pq.delMax();
//            }
//        }

        Stack<Transaction> stack = new Stack<>();
        while (!pq.isEmpty()) {
            stack.push(pq.delMax());
            for (Transaction t : stack) {
                StdOut.println(t);
            }
        }
    }
}
