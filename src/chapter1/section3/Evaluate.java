package chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;


/**
 * @author zkyyo
 * @since 2018-08-20 18:58
 **/
public class Evaluate {
    public static void main(String[] args) {
        String operations = "+-*/sqrt";
        Stack<String> ops = new Stack<>();
        Stack<Double> numbers = new Stack<>();
        while (!StdIn.isEmpty()) {
            String in = StdIn.readString();
            System.out.println(in);
            if ("(".equals(in)) {
                continue;
            }
            if (operations.contains(in)) {
                ops.push(in);
            } else if (in.equals(")")) {
                double num2;
                double num1;
                String op = ops.pop();
                double result;
                switch (op) {
                    case "+":
                        num2 = numbers.pop();
                        num1 = numbers.pop();
                        result = num1 + num2;
                        break;
                    case "-":
                        num2 = numbers.pop();
                        num1 = numbers.pop();
                        result = num1 - num2;
                        break;
                    case "*":
                        num2 = numbers.pop();
                        num1 = numbers.pop();
                        result = num1 * num2;
                        break;
                    case "/":
                        num2 = numbers.pop();
                        num1 = numbers.pop();
                        result = num1 / num2;
                        break;
                    case "sqrt":
                        num2 = numbers.pop();
                        result = Math.sqrt(num2);
                        break;
                    default:
                        result = 0;
                }
                numbers.push(result);
            } else {
                numbers.push(Double.parseDouble(in));
            }
            if (!numbers.isEmpty()) {
                System.out.println("the result is " + numbers.peek());

            }
        }
    }
}
