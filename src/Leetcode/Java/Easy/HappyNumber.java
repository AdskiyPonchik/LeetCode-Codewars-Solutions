package Leetcode.Java.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (!seen.add(n)) {
                return false;
            }
            n = sumOfSquaredDigits(n);
        }

        return true;
    }

    private int sumOfSquaredDigits(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}
