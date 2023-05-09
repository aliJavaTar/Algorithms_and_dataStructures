package com.javaBoy.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void sum() {
        RecursionFSum r = new RecursionFSum();
        int result = r.sum(10);
        Assertions.assertThat(result).isEqualTo(55);
    }


    @Test
    void tailSum() {
        RecursionFSum r = new RecursionFSum();
        int result = r.tailSum(4,2);
        Assertions.assertThat(result).isEqualTo(7);
    }
}