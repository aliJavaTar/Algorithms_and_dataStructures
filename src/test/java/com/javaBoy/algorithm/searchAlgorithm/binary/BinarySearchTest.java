package com.javaBoy.algorithm.searchAlgorithm.binary;

import com.javaBoy.algorithm.searchAlgorithm.binary.BinarySearch;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {
    @Test
    void should_find_number_key() {

        int[] array = {10, 20, 30, 40, 50};
        BinarySearch binarySearch = new BinarySearch(array, 30);
        int result = binarySearch.search();

        Assertions.assertThat(result).isEqualTo(30);


        int[] array1 = {7, 30, 78, 213};
        BinarySearch binarySearch1 = new BinarySearch(array1, 213);
        int result1 = binarySearch1.search();

        Assertions.assertThat(result1).isEqualTo(213);

        int[] array2 = {213,321,543,6543,6754,2134432};
        BinarySearch binarySearch2 = new BinarySearch(array2, 6754);
        int result2 = binarySearch2.search();

        Assertions.assertThat(result2).isEqualTo(6754);

    }
}