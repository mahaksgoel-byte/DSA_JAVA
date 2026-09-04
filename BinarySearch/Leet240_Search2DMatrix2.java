class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[rows - 1].length;
        int top = 0, right = cols - 1;

        while(top < rows && right >= 0){
            int val = matrix[top][right];

            if(val == target) return true;
            else if(val < target) top++;
            else right--;
        }

        return false;
    }
}
