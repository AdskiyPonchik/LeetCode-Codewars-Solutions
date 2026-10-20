package main;

import Leetcode.Middle.DecodeString;

public class Main {
    public static void main(String[] args) {
        DecodeString solver = new DecodeString();

        check(solver, "3[a]2[bc]", "aaabcbc");
        check(solver, "3[a2[c]]", "accaccacc");
        check(solver, "2[abc]3[cd]ef", "abcabccdcdcdef");
        check(solver, "abc3[cd]xyz", "abccdcdcdxyz");
        check(solver, "10[a]", "aaaaaaaaaa");
        check(solver, "2[a3[b]c]", "abbbcabbbc");
        check(solver, "plain", "plain");
    }

    private static void check(DecodeString solver, String input, String expected) {
        try {
            String actual = solver.decodeString(input);
            String status = expected.equals(actual) ? "PASS" : "FAIL";
            System.out.printf(
                    "%s | input=%s | expected=%s | actual=%s%n",
                    status,
                    input,
                    expected,
                    actual
            );
        } catch (RuntimeException exception) {
            System.out.printf(
                    "ERROR | input=%s | expected=%s | %s: %s%n",
                    input,
                    expected,
                    exception.getClass().getSimpleName(),
                    exception.getMessage()
            );
        }
    }
}
