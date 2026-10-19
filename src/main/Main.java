package main;


import Leetcode.Middle.SimplifyPath;

public class Main {
    public static void main(String[] args) {
        SimplifyPath solver = new SimplifyPath();

        String path1 = "/neetcode/practice//...///../courses";
        String path2 = "/..//";
        String path3 = "/..//_home/a/b/..///";

        System.out.println(solver.simplifyPath(path1)); // Ожидается: /neetcode/practice/courses
        System.out.println(solver.simplifyPath(path2)); // Ожидается: /
        System.out.println(solver.simplifyPath(path3)); // Ожидается: /_home/a
    }
}