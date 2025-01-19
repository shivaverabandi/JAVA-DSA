package Matrix_2DArr;

public class UpperLowerTriangle {
    public static void printUpperTri(int [][]matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(j>=i){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printLowerTri(int [][]matrix){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(j<=i){
                    System.out.print(matrix[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]matrix = {{2,3,4},
                          {3,4,5},
                          {1,2,3}
                         };
        printUpperTri(matrix);
        printLowerTri(matrix);
    }
}
