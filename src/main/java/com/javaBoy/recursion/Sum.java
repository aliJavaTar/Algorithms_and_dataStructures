package com.javaBoy.recursion;

public class Sum {

    public int sum(int number) {
        if (number > 0) {
            return number + sum(number - 1);
        }
        else return 0;
    }
}
