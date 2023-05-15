package com.javaBoy.recursion;

import java.util.Arrays;

public class CountOfItems {

    private final int[] array;

    public CountOfItems(int[] array) {
        this.array = array;
    }

    public int calculate() {
        return Arrays.stream(array).sum();
    }
}
