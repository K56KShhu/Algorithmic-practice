package chapter1.util;

/**
 * @author zkyyo
 * @since 2018-08-21 13:39
 **/
public class TimeCounter {
    private long begin;

    public TimeCounter() {
        begin = System.currentTimeMillis();
    }

    public void begin() {
        begin = System.currentTimeMillis();
    }

    public void end() {
        long end = System.currentTimeMillis();
        long period = end - begin;
        System.out.println("---spend " + (period / 1000) + "s   " + period + "ms");
    }
}
