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

        // Row - Wise Prefix 
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                if(col == 0){
                    prefix[row][col] = matrix[row][col];
                }else{
                    prefix[row][col] = prefix[row][col-1] + matrix[row][col];
                }
            }
        }

        // Column Wise Prefix

        for(int col = 0; col < n ; col++){
            for(int row = 0; row < m; row++){
                if(row == 0){
                    prefix[row][col] = prefix[row][col];
                }else{
                    prefix[row][col] = prefix[row-1][col] + prefix[row][col];
                }
            }
        }

    }

    // 2D - Prefix --> O(1) for Query
    public int sumRegion(int row1,int col1,int row2,int col2){
        // Sum(TOP LEFT, BOTTOM RIGHT) ==> prefix[row2][col2] - prefix[row1-1][col2] - prefix[row2][col1-1] + prefix[row1-1][col1-1]

        int ans = 0;
        ans += prefix[row2][col2];

        if(row1 > 0) ans -= prefix[row1-1][col2];

        if(col1 > 0) ans -= prefix[row2][col1-1];

        if(row1 > 0 && col1 > 0) ans += prefix[row1-1][col1-1];

        return ans;
    }




    // 1D Prefix --> O(M) for Query
    public int sumRegion2(int row1, int col1, int row2, int col2) {
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
    public int sumRegion3(int row1, int col1, int row2, int col2) { // O(n*m)
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