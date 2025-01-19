package Matrix_2DArr;

import java.util.Arrays;

public class Addtion {
    private static int[][] addTwoMat(int [][]a, int [][]b){
        for(int i = 0;i<a.length; i++){
            for(int j = 0;j<a[0].length;j++){
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,2}};
        int b[][] = {{2,1},{2,3}};
        a = addTwoMat(a, b);
        for(int i = 0; i<a.length; i++){
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
