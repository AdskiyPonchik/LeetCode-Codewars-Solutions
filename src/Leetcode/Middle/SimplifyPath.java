package Leetcode.Middle;

import java.util.ArrayDeque;
import java.util.Deque;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String[] newPath = path.split("/");
        for (String s : newPath) {
            if (s.isEmpty() || s.equals(".")) {
                continue;
            }
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
            } else {
                stack.addLast(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append('/').append(stack.pop());
        }

        return result.toString();
    }
}
