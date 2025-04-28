package org.example;

public class BoolMatrixPrinter extends MatrixOutlinePrinter{
    @Override
    protected String rowPrinter(Matrix matrix) {
        StringBuilder content = new StringBuilder();
        int[][] data = matrix.getData();
        int row = matrix.rowCount();
        int colum = matrix.columCount();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                int value = data[i][j];
                if (value != 0 && value != 1) {
                    throw new IllegalArgumentException();
                }
                content.append(value);
            }
        }
        return content.toString();
    }
}


