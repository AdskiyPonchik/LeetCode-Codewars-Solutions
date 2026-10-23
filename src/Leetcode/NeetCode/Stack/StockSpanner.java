package Leetcode.NeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpanner {
    Deque<PriceSpan> stack;

    record PriceSpan(int price, int span) {
    }

    public StockSpanner() {
        this.stack = new ArrayDeque<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek().price() <= price) {
            span += stack.pop().span();
        }
        stack.push(new PriceSpan(price, span));
        return span;
    }
}

