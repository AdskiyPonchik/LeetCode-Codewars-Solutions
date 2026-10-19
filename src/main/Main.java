package main;


import Leetcode.Middle.AsteroidCollision;


import Leetcode.Middle.StockSpanner;

public class Main {
    public static void main(String[] args) {
        StockSpanner spanner = new StockSpanner();

        System.out.println(spanner.next(100)); // Ожидается: 1
        System.out.println(spanner.next(80));  // Ожидается: 1
        System.out.println(spanner.next(60));  // Ожидается: 1
        System.out.println(spanner.next(70));  // Ожидается: 2
        System.out.println(spanner.next(60));  // Ожидается: 1
        System.out.println(spanner.next(75));  // Ожидается: 4
        System.out.println(spanner.next(85));  // Ожидается: 6
    }
}