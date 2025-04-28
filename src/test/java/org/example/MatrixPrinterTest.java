package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixPrinterTest {


    @Test
    void testOutlinePrinter() {
        Matrix mat = new Matrix(3,4);
        MatrixOutlinePrinter print = new MatrixOutlinePrinter();
        String actual = print.printer(mat);
        String expected = "+----+\n" + "|    |\n" + "|    |\n" + "|    |\n" + "+----+\n";
        assertEquals(expected, actual);
    }

    @Test
    void testBoolMatrixExceptionHandling() {
        assertThrows(IllegalArgumentException.class,
                () -> new BoolMatrixPrinter().printer(new Matrix(new int[][] {{0, 1, 2}, {1, 0, 1},{0, 1, 1}})));
    }

    @Test
    void testBoolMatrixPrinter() {
        Matrix matrice1 = new Matrix(new int[][] {{0, 1, 1}, {1, 0, 1},{0, 1, 1}});
        BoolMatrixPrinter print = new BoolMatrixPrinter();
        String actual = print.printer(matrice1);
        String expected = "+---+\n" + "|011|\n" + "|101|\n" + "|011|\n" + "+---+\n";
        assertEquals(expected, actual);

        Matrix matrice2 = new Matrix(new int[][] {{1, 1, 1}, {1, 1, 1},{1, 1, 1}});
        BoolMatrixPrinter print2 = new BoolMatrixPrinter();
        String actual2 = print2.printer(matrice2);
        String expected2 = "+---+\n" + "|111|\n" + "|111|\n" + "|111|\n" + "+---+\n";
        assertEquals(expected2, actual2);

    }
}