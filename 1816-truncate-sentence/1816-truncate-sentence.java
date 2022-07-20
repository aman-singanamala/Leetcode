class Solution {
    public String truncateSentence(String s, int k) {
       String[] array = s.split(" ");
        String result="";
        for (int i = 0; i < k; i++) {
            result=result+array[i];
            result=result+" ";
        }
        
        return result.trim();
    }
}