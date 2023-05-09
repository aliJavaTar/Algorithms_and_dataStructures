package com.javaBoy.recursion;

public class RecursionFSum {

    public int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        } else return 0;
    }

    public int tailSum(int currentSum, int n) {
        if (n <= 1) {
            return currentSum + n;
        }
        return tailSum(currentSum + n, n - 1);

    }
}
