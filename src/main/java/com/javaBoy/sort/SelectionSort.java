package com.javaBoy.sort;

public class SelectionSort {
    private final int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        int temp;
        for (int index = 0; index < array.length; index++) {
            for (int j = index + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
