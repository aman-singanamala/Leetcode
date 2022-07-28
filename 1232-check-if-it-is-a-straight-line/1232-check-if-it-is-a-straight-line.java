class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        int dx= x2-x1;
        int dy= y2-y1;

        for (int i=2;i<coordinates.length;++i){
            int x3=coordinates[i][0];
            int y3=coordinates[i][1];
            if((y3-y1)*dx!=dy*(x3-x1)){
                return false;
            }
        }
        return true;
        // ((y3-y1)/(x3-x1)) != ((y2-y1)/(x2-x1))

// exchange the denominators for ignoring (if diff is 0)
    }
}