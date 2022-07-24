class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col_max= matrix[0].length-1;
        while(row< matrix.length && col_max>=0){
            if(matrix[row][col_max]==target){
                return true;
            } else if (matrix[row][col_max]<target) {
                row++;
            }
            else {
                col_max--;
            }
        }
        return false;
    }
}