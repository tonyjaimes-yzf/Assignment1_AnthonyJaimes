package org.example;
//------------------------------------------------------
// Lab Assignment 1
// Written by: Anthony Jaimes 2018391
// For SE350 Section (602) – Spring 2025
//------------------------------------------------------
public class Matrix {
    private int[][] data;

    public void setData(int[][] data){
        this.data= data;
    }
    public int[][] getData(){
        return data;
    }
    public int rowCount(){
        return data.length;
    }
    public int columCount(){
        return data[0].length;
    }
    public Matrix(int rows, int colums){
        if (rows >= 1 && colums >= 1){
            this.data = new int[rows][colums];
        } else {
            throw new IllegalArgumentException();
        }
    }
    public Matrix(int[][] data){
        if (data!= null && data.length >= 1 && data[0].length >= 1) {
            this.data = data;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
