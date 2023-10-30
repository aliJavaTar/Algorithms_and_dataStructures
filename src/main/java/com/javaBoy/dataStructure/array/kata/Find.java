package com.javaBoy.dataStructure.array.kata;

public class Find {

    private final int[] setOfNumber;

    public Find(int[] setOfNumber) {
        if (setOfNumber.length < 3)
            throw new IllegalArgumentException("you hava to three element");
        this.setOfNumber = setOfNumber;
    }

    public int[] findLargestThree() {
        int firstLargest, secondLargest, thirdLargest = 0;

        return new int[]{};
    }

    public int[] getSetOfNumber() {
        return setOfNumber;
    }
}
