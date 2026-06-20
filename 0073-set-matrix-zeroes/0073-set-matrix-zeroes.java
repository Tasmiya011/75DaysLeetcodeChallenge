class Solution {                               //SDE
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColzero = false;

        for(int j=0; j < cols; j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }
        for(int i=0; i < rows; i++){
            if(matrix[i][0] == 0){
                firstColzero = true;
                break;
            }
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
            for(int i=1; i<rows; i++){
                for(int j=1; j<cols; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRowZero){
            for(int j = 0; j<cols; j++){
                matrix[0][j] = 0;
            }
        }
            if(firstColzero){
            for(int i=0; i<rows; i++){
                matrix[i][0] = 0;
            }
        }
    }
}