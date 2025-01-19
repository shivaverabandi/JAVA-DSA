//Definition: A symmetric matrix is a square matrix that is equal to its transpose

package Matrix_2DArr;
public class Symmetric {

    public static boolean isSymmetric(int a[][]){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(a[i][j] != a[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][]a = {{1,1,-1},
                   {1,2,1},
                   {-1,0,5},
                  };
        System.out.println(isSymmetric(a));
    }
}
