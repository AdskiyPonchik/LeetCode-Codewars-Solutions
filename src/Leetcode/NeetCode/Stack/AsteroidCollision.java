package Leetcode.NeetCode.Stack;

import java.util.Arrays;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int[] stack = new int[asteroids.length];
        int top = -1;

        for (int current : asteroids) {
            boolean alive = true;

            while (alive
                    && top >= 0
                    && stack[top] > 0
                    && current < 0) {

                if (stack[top] < Math.abs(current)) {
                    top--;
                } else if (stack[top] == Math.abs(current)) {
                    top--;
                    alive = false;
                } else {
                    alive = false;
                }
            }

            if (alive) {
                stack[++top] = current;
            }
        }
        return Arrays.copyOf(stack, top + 1);
    }
}
