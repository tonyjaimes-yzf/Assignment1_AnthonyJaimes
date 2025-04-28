package org.example;

public class MatrixOutlinePrinter implements MatrixPrinter{
    public String printer(Matrix matrix) {
        StringBuilder outline = new StringBuilder();
        int row = matrix.rowCount();
        int colum = matrix.columCount();

        outline.append('+');
        for (int i = 0; i < colum; i++) {
            outline.append('-');
        }
        outline.append('+');
        outline.append("\n");


        for (int i = 0; i < row; i++) {
            outline.append('|');
            outline.append(rowPrinter(matrix));
            outline.append('|');
            outline.append("\n");
        }
        outline.append('+');
        for (int i = 0; i < colum; i++) {
            outline.append('-');
        }
        outline.append('+');
        outline.append("\n");

        return outline.toString();
    }
    protected String rowPrinter(Matrix matrix) {
        int colum = matrix.columCount();
        StringBuilder content  = new StringBuilder();
        for (int i = 0; i < colum; i++) {
            content.append(' ');
        }
        return content.toString();
    }

}
