package org.example;
//------------------------------------------------------
// Lab Assignment 1
// Written by: Anthony Jaimes 2018391
// For SE350 Section (602) – Spring 2025
//------------------------------------------------------
public class BoolMatrixPrinter extends MatrixOutlinePrinter{
    @Override
    protected String rowPrinter(Matrix matrix, int index) {
        StringBuilder content = new StringBuilder();
        int[][] data = matrix.getData();
        int colum = matrix.columCount();

        for (int i = 0; i < colum; i++) {
            int value = data[index][i];
            if (value != 0 && value != 1) {
                throw new IllegalArgumentException();
            }
            content.append(value);
        }
        return content.toString();
    }
}


