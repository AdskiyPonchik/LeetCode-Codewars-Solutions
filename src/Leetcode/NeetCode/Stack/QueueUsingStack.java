package Leetcode.NeetCode.Stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class QueueUsingStack {
    private final Deque<Integer> in;
    private final Deque<Integer> out;

    public QueueUsingStack() {
        this.in = new ArrayDeque<>();
        this.out = new ArrayDeque<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        shift();
        return out.pop();
    }

    public int peek() {
        shift();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void shift() {
        if (empty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}

