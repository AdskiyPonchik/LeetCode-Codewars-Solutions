package Leetcode.Easy;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingQueues {

    private final Queue<Integer> stack;

    public StackUsingQueues() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int x) {
        int length = stack.size();
        stack.add(x);
        for(int i = 0; i < length; i++){
            stack.add(stack.poll());
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stack.poll();
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new NullPointerException("Stack is empty");
        }
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
