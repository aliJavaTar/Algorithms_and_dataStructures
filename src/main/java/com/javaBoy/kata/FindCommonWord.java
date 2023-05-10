package com.javaBoy.kata;

public class FindCommonWord {

    public boolean hasCommonWord(char[] firstArray, char[] secondArray) {
        for (char character : firstArray) {
            for (char value : secondArray) {
                if (character == value)
                    return true;
            }
        }
        return false;

    }
}
