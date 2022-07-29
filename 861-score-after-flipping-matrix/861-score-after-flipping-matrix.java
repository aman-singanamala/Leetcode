class Solution {
    public int matrixScore(int[][] A) {
        int m = A.length; //number of rows
        int n = A[0].length; //num of cols

        //count[i] represents num of 1s in col i
        int[] count = new int[n];

        //flip row and count 1s in each col
        for(int i=0;i<m;i++)
        {
            boolean flip = A[i][0] == 0;
            for(int j=0;j<n;j++)
            {
                if(flip)
                    A[i][j] ^= 1;
                count[j] += A[i][j];
            }
        }

        int rst = 0;
        //calculate rst and also flip col if needed
        for(int j=n-1, temp=1;j>=0; j--, temp*=2)
        {
            int num0 = m - count[j];
            if(num0 > count[j]) //flip col
                count[j] = num0;
            rst += temp* count[j];
        }

        return rst;
    }
}