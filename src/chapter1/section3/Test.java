package chapter1.section3;

import java.util.Stack;

/**
 * @author zkyyo
 * @since 2018-08-20 17:03
 **/
public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("asd");
        stack.push(null);
        stack.push("66");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
