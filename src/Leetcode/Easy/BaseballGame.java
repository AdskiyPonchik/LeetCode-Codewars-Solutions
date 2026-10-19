package Leetcode.Easy;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (String s : operations) {
            if (Objects.equals(s, "D")) {
                deque.push(deque.peek() * 2);
            } else if (Objects.equals(s, "C")) {
                deque.pop();
            } else if (Objects.equals(s, "+")) {
                int num1 = deque.pop();
                int sum = deque.peek() + num1;
                deque.push(num1);
                deque.push(sum);
            } else {
                deque.push(Integer.parseInt(s));
            }
        }
        int result = 0;
        while (!deque.isEmpty()) {
            result += deque.pop();
        }
        return result;
    }
}
