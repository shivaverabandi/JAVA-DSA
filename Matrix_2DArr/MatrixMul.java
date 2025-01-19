package Matrix_2DArr;

import java.util.Arrays;

public class MatrixMul {

    public static void matrixMul(int a[][],int b[][],int c[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b[0].length; j++){
                for(int k = 0; k<a[0].length; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1,2},{2,1}};
        int b[][] = {{2,1},{2,1}};
        int c[][] = new int[2][2];
        matrixMul(a, b, c);
        for (int i[] : c) {
            System.out.println(Arrays.toString(i));
        }
    }
}