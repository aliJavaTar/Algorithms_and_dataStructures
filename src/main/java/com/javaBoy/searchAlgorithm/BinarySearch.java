package com.javaBoy.searchAlgorithm;

public class BinarySearch {

    private final int[] array;
    private final int key;
    private int findNumber = -1;

    public BinarySearch(int[] array, int key) {
        this.array = array;
        this.key = key;
    }

    public int search() {
        int firstElement = 0;
        int lastElement = array.length - 1;
        int middleElement = (lastElement + firstElement) / 2;

        while (firstElement <= lastElement) {
            if (array[middleElement] < key)
            {
                firstElement = middleElement + 1;
            } else if (array[middleElement] == key) {
                findNumber = array[middleElement];
                break;
            } else {
                lastElement = middleElement - 1;
            }
            middleElement = (lastElement + firstElement) / 2;
        }
        return findNumber;
    }


}
