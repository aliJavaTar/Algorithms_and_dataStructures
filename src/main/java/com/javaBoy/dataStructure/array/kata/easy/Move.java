package com.javaBoy.dataStructure.array.kata.easy;

public class Move {

    public int[] pushZerosToEnd(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                array[count++] = array[i];

        while (count < array.length)
            array[count++] = 0;


        return array;

    }
}
