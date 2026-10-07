package main;


import Leetcode.Easy.MonotonicArray;

public class Main {
    public static void main(String[] args) {
        MonotonicArray test = new MonotonicArray();
        System.out.println(test.isMonotonic(new int[]{1, 2, 2, 3})); //true
        System.out.println(test.isMonotonic(new int[]{6, 5, 4, 4})); //true
        System.out.println(test.isMonotonic(new int[]{7, 7, 7})); //true
        System.out.println(test.isMonotonic(new int[]{1, 3, 2})); //false
        System.out.println(test.isMonotonic(new int[]{1, 1, 0})); //true
        System.out.println(test.isMonotonic(new int[]{1, 1, 2})); //true
    }
}
