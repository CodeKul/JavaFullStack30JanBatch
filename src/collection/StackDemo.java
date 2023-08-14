package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.printf("stk "+stack);

        System.out.println("pop "+stack.pop());
        System.out.println("peek "+stack.peek());
    }
}
