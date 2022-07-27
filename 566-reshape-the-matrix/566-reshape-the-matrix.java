class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col = mat[0].length;
        int[]a=new int[row*col];
        int k=0;
        if(row*col!=r*c) return mat;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[k++]=mat[i][j];
            }
        }
        
        int[][] newMat=new int[r][c];
        int p=0;
        for(int l=0;l<r;l++){
            for(int m=0;m<c;m++){
                newMat[l][m]=a[p++];
            }
        }
        
        return newMat;
    }
}