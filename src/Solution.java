import java.util.*;

/**
 * @author zkyyo
 * @since 2019-01-28 20:49
 **/
public class Solution {

    public static void main(String[] args) {
        new Solution().test();
    }

    public void test() {
        Set<Pair> list = new HashSet<>();
        Pair pair1 = new Pair(1, 2);
        Pair pair2 = new Pair(2, 3);
        Pair pair3 = new Pair(3, 4);
        Pair pair4 = new Pair(4, 5);
        list.add(pair1);
        list.add(pair2);
        list.add(pair3);
        list.add(pair4);
        System.out.println(list.contains(pair1));
    }

    class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

}
