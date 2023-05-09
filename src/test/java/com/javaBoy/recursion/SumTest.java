package com.javaBoy.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        Sum r = new Sum();
        int result = r.sum(10);
        Assertions.assertThat(result).isEqualTo(55);
    }
}