package Leetcode.Middle;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    record Frame(StringBuilder prefix, int repeat) {
    }

    public String decodeString(String s) {
        Deque<Frame> stack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int repeat = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(new Frame(current, repeat));
                current = new StringBuilder();
                repeat = 0;
            } else if (c == ']') {
                Frame prevFrame = stack.pop();
                current = prevFrame.prefix().append(current.toString().repeat(prevFrame.repeat()));
            } else if (c >= '0' && c <= '9') {
                repeat = repeat * 10 + (c - '0');
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }
}
