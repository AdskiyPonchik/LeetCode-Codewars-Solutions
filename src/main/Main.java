package main;

import Leetcode.Easy.QueueUsingStack;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        check("new queue is empty", true, queue.empty());

        queue.push(1);
        queue.push(2);
        check("peek returns oldest element", 1, queue.peek());
        check("peek does not remove element", 1, queue.peek());
        check("pop returns oldest element", 1, queue.pop());
        check("queue is not empty after one pop", false, queue.empty());

        queue.push(3);
        queue.push(4);
        check("previous element keeps FIFO priority", 2, queue.pop());
        check("next FIFO pop", 3, queue.pop());
        check("newest element is removed last", 4, queue.peek());
        check("last pop returns newest element", 4, queue.pop());
        check("queue is empty after all pops", true, queue.empty());

        queue.push(5);
        check("queue can be reused", 5, queue.peek());
        check("reused queue pops correctly", 5, queue.pop());
        check("reused queue ends empty", true, queue.empty());
    }

    private static void check(String scenario, int expected, int actual) {
        String status = expected == actual ? "PASS" : "FAIL";
        System.out.printf(
                "%s | %s | expected=%d | actual=%d%n",
                status,
                scenario,
                expected,
                actual
        );
    }

    private static void check(String scenario, boolean expected, boolean actual) {
        String status = expected == actual ? "PASS" : "FAIL";
        System.out.printf(
                "%s | %s | expected=%s | actual=%s%n",
                status,
                scenario,
                expected,
                actual
        );
    }
}
