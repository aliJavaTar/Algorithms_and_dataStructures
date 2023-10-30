package com.javaBoy.dataStructure.array.kata;

public record Find(int[] numbers) {

    public Find {
        if (numbers.length < 3)
            throw new IllegalArgumentException("you hava to three element");
    }

    public int[] findLargestThree() {
//        int firstLargest, secondLargest, thirdLargest = 0;

        int[] largestThree = new int[3];
        int shorterNumber = numbers[0];
        int count=0;
        for (int index = 1; index < numbers.length; index++) {
            if (shorterNumber > numbers[index]) {
                shorterNumber = numbers[index];
            }
            largestThree[count] = numbers[index];
            count++;
        }

        return largestThree;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
