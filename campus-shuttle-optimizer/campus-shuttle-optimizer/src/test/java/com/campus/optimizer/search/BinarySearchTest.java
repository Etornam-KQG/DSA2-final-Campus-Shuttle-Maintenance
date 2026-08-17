package com.campus.optimizer.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void shouldFindTargetInSortedArray() {
        int[] array = {4, 8, 12, 25, 42, 68};

        assertEquals(4, BinarySearch.search(array, 42));
    }

    @Test
    void shouldReturnMinusOneWhenTargetIsNotFound() {
        int[] array = {4, 8, 12, 25, 42, 68};

        assertEquals(-1, BinarySearch.search(array, 100));
    }

    @Test
    void shouldFindTargetAtFirstPosition() {
        int[] array = {4, 8, 12, 25, 42, 68};

        assertEquals(0, BinarySearch.search(array, 4));
    }

    @Test
    void shouldFindTargetAtLastPosition() {
        int[] array = {4, 8, 12, 25, 42, 68};

        assertEquals(5, BinarySearch.search(array, 68));
    }

    @Test
    void shouldFindTargetInSingleElementArray() {
        int[] array = {42};

        assertEquals(0, BinarySearch.search(array, 42));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        int[] array = {};

        assertEquals(-1, BinarySearch.search(array, 42));
    }
}
