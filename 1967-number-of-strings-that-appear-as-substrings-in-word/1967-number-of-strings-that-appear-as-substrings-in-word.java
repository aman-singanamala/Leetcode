class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String str : patterns){
            if(word.indexOf(str)>=0){
                count++;
            }
        }
        return count;
    }
}