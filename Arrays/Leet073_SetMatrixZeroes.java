class Solution {
    public void setZeroes(int[][] matrix) {
        int rowBit = 1, colBit = 1;
        int n = matrix.length, m = matrix[0].length;

        for(int i = 0; i < n; i++){
            if(matrix[i][0] == 0){
                colBit = 0;
                break;
            }
        }

        for(int i = 0; i < m; i++){
            if(matrix[0][i] == 0){
                rowBit = 0;
                break;
            }
        }

        for(int i = n - 1; i > 0; i--){
            for(int j = m - 1; j > 0; j--){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = m - 1; i > 0; i--){
            if(matrix[0][i] == 0){
                for(int j = 0; j < n; j++){
                    matrix[j][i] = 0;
                }
            }
        }

        for(int i = n - 1; i > 0; i--){
            if(matrix[i][0] == 0){
                for(int j = 0; j < m; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        if(rowBit == 0){
            for(int i = 0; i < m; i++) matrix[0][i] = 0;
        }
        if(colBit == 0){
            for(int i = 0; i < n; i++) matrix[i][0] = 0;
        }
    }
}
