package main;


import Leetcode.Easy.MaximumAverageSubarray;


public class Main {
    public static void main(String[] args) {
        MaximumAverageSubarray test = new MaximumAverageSubarray();
        System.out.println(test.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4)); //12.75
        System.out.println(test.findMaxAverage(new int[]{5}, 1)); //5.0
    }
}
