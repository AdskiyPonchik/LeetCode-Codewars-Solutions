package main;


import Leetcode.Easy.MinimumMoves;


public class Main {
    public static void main(String[] args) {
        MinimumMoves test = new MinimumMoves();
        System.out.println(test.minimumMoves("XXX")); //1
        System.out.println(test.minimumMoves("XXOX")); //2
        System.out.println(test.minimumMoves("OOOO")); //0
    }
}
