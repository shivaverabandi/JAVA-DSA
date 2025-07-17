class NumMatrix {
    private int [][]matrix;
    int m; // rows
    int n; // columns

    private int [][]prefix; // prefix array

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;

        m = matrix.length;
        n = matrix[0].length;

        // calculating prefix for each row
        prefix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(j == 0){
                    prefix[i][j] = matrix[i][j];
                }else{
                    prefix[i][j] = prefix[i][j-1] + matrix[i][j];
                }
            }
        }
    }
    
    // 1D Prefix --> O(M)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        
        for(int row = row1; row <= row2; row++){
            // prefix formulae --> sum(L,R) => prefix[R] - prefix[L-1]

            if(col1 > 0){
                ans += prefix[row][col2] - prefix[row][col1 - 1];
            }else{
                ans += prefix[row][col2];
            }
        }
        return ans;
    }




    // Brute Force solution
    public int sumRegion2(int row1, int col1, int row2, int col2) { // O(n*m)
        int ans = 0;
        for(int i = row1; i <= row2; i++){
            for(int j = col1; j <= col2; j++){
                ans += matrix[i][j];
            }
        }
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */