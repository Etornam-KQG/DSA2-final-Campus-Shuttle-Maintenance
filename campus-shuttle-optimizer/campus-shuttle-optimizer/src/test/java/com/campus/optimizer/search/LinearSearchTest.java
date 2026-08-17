package com.campus.optimizer.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void shouldFindTargetInArray() {
        int[] array = {68, 25, 42, 8, 12};

        assertEquals(2, LinearSearch.search(array, 42));
    }

    @Test
    void shouldReturnMinusOneWhenTargetIsNotFound() {
        int[] array = {68, 25, 42, 8, 12};

        assertEquals(-1, LinearSearch.search(array, 100));
    }

    @Test
    void shouldFindTargetAtFirstPosition() {
        int[] array = {68, 25, 42, 8, 12};

        assertEquals(0, LinearSearch.search(array, 68));
    }

    @Test
    void shouldFindTargetAtLastPosition() {
        int[] array = {68, 25, 42, 8, 12};

        assertEquals(4, LinearSearch.search(array, 12));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        int[] array = {};

        assertEquals(-1, LinearSearch.search(array, 42));
    }

    @Test
    void shouldReturnFirstOccurrenceWhenTargetAppearsMoreThanOnce() {
        int[] array = {68, 25, 42, 25, 12};

        assertEquals(1, LinearSearch.search(array, 25));
    }
}
