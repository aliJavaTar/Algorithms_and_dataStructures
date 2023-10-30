package com.javaBoy.dataStructure.array.kata;

public record Find(int[] numbers) {

    public Find {
        if (numbers.length < 3) throw new IllegalArgumentException("you hava to three element");
    }

    public int[] findLargestThree() {
        int firstLargest = 0, secondLargest = 0, thirdLargest = 0;
        int firstIndex = 0, secondIndex = 0;

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
            if (thirdLargest < numbers[index] && (index != firstIndex && index !=secondIndex)) {
                thirdLargest = numbers[index];
            }

        }
        return new int[]{firstLargest, secondLargest, thirdLargest};
    }

}
