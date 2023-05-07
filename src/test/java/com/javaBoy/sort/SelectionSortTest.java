package com.javaBoy.sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {
    @Test
    void should_sort_array() {
        int[] array = {9, 14, 3, 2, 43, 11, 58, 22};
        SelectionSort selection = new SelectionSort(array);
        int[] arrayOfterSort = selection.sort();

        int[] expected = {2, 3, 9, 11, 14, 22, 43, 58};
        Assertions.assertThat(arrayOfterSort).isEqualTo(expected);
    }

}