package com.javaBoy.recursion;

import java.util.Arrays;

public class CountOfItems {

    private final int[] array;

    public CountOfItems(int[] array) {
        this.array = array;
    }

    public int calculate() {
        int sum = 0;
        for (int index : array) {
            sum += index;
        }
        return sum;
//        return Arrays.stream(array).sum();
    }

    public int recursion(int[] array, int number) {

        if (number <= 0)
            return 0;
        return (recursion(array, number - 1) + array[number - 1]);
    }
}
