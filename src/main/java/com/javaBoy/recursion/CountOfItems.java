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
}
