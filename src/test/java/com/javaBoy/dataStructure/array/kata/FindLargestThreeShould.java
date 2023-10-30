package com.javaBoy.dataStructure.array.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLargestThreeShould {

    @Test
    void find_three_larger_number_in_array() {
        Find find = new Find(new int[]{11, 65, 193, 36});
        int[] expected1 = {65, 193, 36};
        Assertions.assertArrayEquals(expected1, find.findLargestThree());

        Find largestThree = new Find(new int[]{12, 13, 1, 10, 34});
        int[] expected2 = {12, 13, 34};
        Assertions.assertArrayEquals(expected2, largestThree.findLargestThree());


//        Find findNumber = new Find(new int[]{11, 65, 193, 36, 209, 664, 32});
//        int[] expected3 = {193, 209, 664};
//        Assertions.assertArrayEquals(expected3, findNumber.findLargestThree());
    }
}