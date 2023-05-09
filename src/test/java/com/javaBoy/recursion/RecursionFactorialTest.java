package com.javaBoy.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RecursionFactorialTest {

    @ParameterizedTest
    @ValueSource(ints = {5, 7, 2})
    void should_calculateFactorial(int number) {
        RecursionFactorial factorial = new RecursionFactorial();
        int result = factorial.calculateFactorial(number);
        Assertions.assertThat(result).isEven();
    }
}