package com.javaBoy.recursion;

public class RecursionFactorial {
    // 5
    public int calculateFactorial(int number) {
        if (number == 1)
            return 1;
        else {
            return (number * calculateFactorial(number - 1));
        }
    }
}
