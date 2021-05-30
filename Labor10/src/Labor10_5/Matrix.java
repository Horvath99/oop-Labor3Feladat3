package Labor10_5;

import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;
    public Matrix(int rows, int columns){
        this.columns=columns;
        this.rows=rows;
         this.data=new double[rows][columns];

    }
    public Matrix(double[][] matrix){
        this.rows=matrix.length;
        this.columns= matrix[0].length;
        this.data=new double[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                this.data[i][j]=matrix[i][j];
            }
        }
    }
    public Matrix(Matrix matrix){
        this.rows=matrix.rows;
        this.columns= matrix.columns;
        this.data=new double[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                this.data[i][j]=matrix.data[i][j];
            }
        }
    }
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public void fillRandom(double a,double b){
        Random random=new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                double randomValue = a + (b - a) * random.nextDouble();
                data[i][j]=randomValue;
            }
        }
    }
    public static Matrix add(Matrix a,Matrix b) throws MatrixException {
        if(a.columns!=b.columns || a.rows!=b.rows){
            throw new MatrixException("A muvelet nem elvegezheto");
        }
        Matrix eredmeny=new Matrix(a.rows,a.columns);
        for(int i=0;i<eredmeny.rows;i++)
        {
            for(int j=0;j<eredmeny.columns;j++){
                eredmeny.data[i][j]=a.data[i][j]+b.data[i][j];
            }
        }
        return eredmeny;


    }
    public static Matrix multiply(Matrix a,Matrix b) throws MatrixException{
        if(a.columns!=b.rows){
            throw new MatrixException("A muvelet nem elvegezheto");
        }
        Matrix eredmeny=new Matrix(a.rows,b.columns);
        for(int i=0;i<eredmeny.rows;i++){
            for(int j=0;j<eredmeny.columns;j++){
                double value=0;
                for(int k=0;k<a.columns;k++){
                    value=value+a.data[i][k]*b.data[k][j];
                }
                eredmeny.data[i][j]=value;
            }
        }
        return eredmeny;
    }
    public static Matrix transpose(Matrix matrix){
        Matrix eredmeny=new Matrix(matrix.columns, matrix.rows);
        for(int i=0;i<eredmeny.rows;i++){
            for(int j=0;j<eredmeny.columns;j++){
                eredmeny.data[i][j]=matrix.data[j][i];
            }
        }
        return eredmeny;
    }

    public void printMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
