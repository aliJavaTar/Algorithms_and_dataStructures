package com.javaBoy.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CountOfItemsTest {

    @Test
    void should_calculate_count_of_items() {
        int[] array = {1, 2, 5, 7};
        int count = new CountOfItems(array).calculate();
        Assertions.assertThat(count).isEqualTo(15);
    }
}