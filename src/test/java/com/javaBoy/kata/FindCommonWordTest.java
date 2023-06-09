package com.javaBoy.kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindCommonWordTest {

    @Test
    void should_if_find_common_word_in_array_return_true() {
        FindCommonWord word = new FindCommonWord();
        char[] characters = {'a', 'b', 'c'};
        char[] words = {'y', 'e', 'c'};
        Assertions.assertThat(word.hasCommonWord(characters, words)).isTrue();
    }

    @Test
    void should_if_find_common_word_in_array_return_true_better() {
        FindCommonWord word = new FindCommonWord();
        char[] characters = {'a', 'b', 'c'};
        char[] words = {'y', 'e', 'c'};
        Assertions.assertThat(word.hasCommonWordBetterWayWhitMap(characters, words)).isTrue();

        char[] characters1 = {'a', 'b', 'c'};
        char[] words1 = {'y', 'e', 'd'};
        Assertions.assertThat(word.hasCommonWordBetterWayWhitMap(characters1, words1)).isFalse();
    }

}