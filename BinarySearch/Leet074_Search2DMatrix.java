class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[rows - 1].length;

        int left = 0, right = (rows * cols) - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            int mid_i = mid / cols;
            int mid_j = mid % cols;

            int val = matrix[mid_i][mid_j];

            if(val == target) return true;
            else if(val < target) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
