class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        char leftchar;
        char rightchar;
        while(left<=right){
            leftchar=s.charAt(left);
            rightchar=s.charAt(right);
            //skip non-alphanumeric character
            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightchar)) {
                right--;
            }
            else {
                if(Character.toLowerCase(leftchar)!=Character.toLowerCase(rightchar)){
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }
}