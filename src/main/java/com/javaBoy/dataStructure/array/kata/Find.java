package com.javaBoy.dataStructure.array.kata;

public class Find {

    private final int[] numbers;

    public Find(int[] numbers) {
        if (numbers.length < 3) throw new IllegalArgumentException("you hava to three element");
        this.numbers=numbers;
    }

    public int[] findLargestThree() {
        int firstLargest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        int firstIndex = 0;
        int secondIndex = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (firstLargest < numbers[index]) {
                firstLargest = numbers[index];
                firstIndex = index;
            }
        }

        for (int index = 0; index < numbers.length; index++) {
            if (secondLargest < numbers[index] && index != firstIndex) {
                secondLargest = numbers[index];
                secondIndex = index;
            }
        }

        for (int index = 0; index < numbers.length; index++) {
            if (thirdLargest < numbers[index] && (index != firstIndex && index != secondIndex)) {
                thirdLargest = numbers[index];
            }

        }
        return new int[]{firstLargest, secondLargest, thirdLargest};
    }

}
