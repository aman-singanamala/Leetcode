class Solution {
    public int balancedStringSplit(String s) {
        int r=0,c=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            else{
                c++;
            }
            if(r==c){
                count++;
            }
        }
        return count;
    }
}