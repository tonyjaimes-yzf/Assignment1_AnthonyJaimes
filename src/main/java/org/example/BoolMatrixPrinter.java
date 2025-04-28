package org.example;

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


