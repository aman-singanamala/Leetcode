class Solution {
    public int lengthOfLastWord(String s) {
        String str= s.trim();
        String[] a = str.split(" ");
        return a[a.length-1].length();
    }
}