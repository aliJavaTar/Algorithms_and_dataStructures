package com.javaBoy.dataStructure.array.kata.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MoveTest {
    @Test
    void all_zero_move_to_end_of_array() {
        Move move = new Move();

        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int[] numbers = move.pushZerosToEnd(array);
        System.out.println(Arrays.toString(numbers));
        Assertions.assertArrayEquals(numbers, new int[]{1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0});
    }
}