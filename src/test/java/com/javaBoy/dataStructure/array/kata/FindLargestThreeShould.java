package com.javaBoy.dataStructure.array.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindLargestThreeShould {

    @Test
    void find_three_larger_number_in_array() {
        Find find = new Find(new int[]{11, 65, 193, 36});
        int[] expected = {65, 193, 36};
        Assertions.assertArrayEquals(expected, find.findLargestThree());


//        int[] setOfNumber = {11, 65, 193, 36, 209, 664, 32};

    }
}