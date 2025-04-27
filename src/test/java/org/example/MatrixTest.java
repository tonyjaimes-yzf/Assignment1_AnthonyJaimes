package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @org.junit.jupiter.api.Test
    void testMatrix() {
        assertThrows(IllegalArgumentException.class,
                () -> new Matrix(0, 6));
    }

    @org.junit.jupiter.api.Test
    void testRowCount() {
        Matrix mat = new Matrix(5,6);
        int actual = mat.rowCount();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testColumCount() {
        Matrix mat = new Matrix(3,4);
        int actual = mat.columCount();
        int expected = 4;
        assertEquals(expected, actual);

    }
}