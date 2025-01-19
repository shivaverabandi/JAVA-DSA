package Matrix_2DArr;
public class Row_Col{

    public static void printRowWise(int [][]matrix){
        int N = matrix.length;
        int M = matrix[0].length;
        for(int i = 0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printColWise(int [][]matrix){
        int N = matrix.length;
        int M = matrix[0].length;
        for(int i = 0;i<M;i++){
            for(int j=0;j<N;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]matrix = {{2,3,4,6},
                          {3,4,5,1},
                          {1,2,3,4}
                         };
        printRowWise(matrix);
        printColWise(matrix);
    }
}