package Matrix_2DArr;

public class Sparse {
    public static boolean isSparseMatrix(int matrix[][]){
        int Z = 0;
        int NZ = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    Z++;
                }else{
                    NZ++;
                }
            }
        }
        return Z>NZ;
    }
    public static void main(String[] args) {
        int [][]matrix = {{0,1,4,6},
                          {0,0,0,1},
                          {0,0,0,4}
                         };
        System.out.println(isSparseMatrix(matrix));
    }
}
