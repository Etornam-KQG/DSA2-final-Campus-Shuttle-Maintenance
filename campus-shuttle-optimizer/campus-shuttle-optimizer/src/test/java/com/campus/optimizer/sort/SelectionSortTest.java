package com.campus.optimizer.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void shouldSortArrayInAscendingOrder() {
        int[] array = {68, 25, 42, 8, 12, 12, 25, 4};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{4, 8, 12, 12, 25, 25, 42, 68},
                array
        );
    }

    @Test
    void shouldSortAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                array
        );
    }

    @Test
    void shouldSortReverseSortedArray() {
        int[] array = {5, 4, 3, 2, 1};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                array
        );
    }

    @Test
    void shouldHandleDuplicateValues() {
        int[] array = {4, 2, 4, 1, 2};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{1, 2, 2, 4, 4},
                array
        );
    }

    @Test
    void shouldHandleSingleElementArray() {
        int[] array = {42};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{42},
                array
        );
    }

    @Test
    void shouldHandleEmptyArray() {
        int[] array = {};

        SelectionSort.sort(array);

        assertArrayEquals(
                new int[]{},
                array
        );
    }
}
