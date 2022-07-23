class Solution {
    public int[][] transpose(int[][] matrix) {
       int m= matrix.length;
        int n= matrix[0].length;
        int[][] temp= new int[n][m];// 3*2 is changed into 2*3 when we transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][i]= matrix[i][j];
            }
        }
        return temp;
    }
}