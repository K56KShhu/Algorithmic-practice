package chapter1.section1;

import chapter1.util.MyUtils;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (key < a[mid]) {
                right = mid - 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = new In(MyUtils.getFilePath("tinyW.txt")).readAllInts();
        int[] keys = new In(MyUtils.getFilePath("tinyT.txt")).readAllInts();

        Arrays.sort(whitelist);
        for (int key : keys) {
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }
}