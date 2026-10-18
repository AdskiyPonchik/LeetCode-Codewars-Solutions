package main;


import Leetcode.Middle.AsteroidCollision;

import java.util.Arrays;


public class Main {
    private static void check(int[] actual, int[] expected) {
        if (!Arrays.equals(actual, expected)) {
            throw new RuntimeException("blunder?? Ожидалось: " + Arrays.toString(expected) + ", получено: " + Arrays.toString(actual));
        }
    }

    public static void main(String[] args) {
        AsteroidCollision sol = new AsteroidCollision();

        // Example 1
        int[] a1 = {5, 10, -5};
        check(sol.asteroidCollision(a1), new int[]{5, 10});

        // Example 2
        int[] a2 = {8, -8};
        check(sol.asteroidCollision(a2), new int[]{});

        // Example 3
        int[] a3 = {10, 2, -5};
        check(sol.asteroidCollision(a3), new int[]{10});

        // Example 4
        int[] a4 = {3, 5, -6, 2, -1, 4};
        check(sol.asteroidCollision(a4), new int[]{-6, 2, 4});

        // Крайний случай: астероиды летят в разные стороны и не сталкиваются
        int[] a5 = {-2, -1, 1, 2};
        check(sol.asteroidCollision(a5), new int[]{-2, -1, 1, 2});

        System.out.println("Все тесты прошли успешно! 🚀");
    }
}