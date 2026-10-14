
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {
    @Test
    void testSum() {
        assertEquals(10, ArraySum.sum(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testNegativeValues() {
        assertEquals(2, ArraySum.sum(new int[]{-1, 3}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, ArraySum.sum(new int[]{}));
    }
}
