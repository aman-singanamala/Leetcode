class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean ans= true;
        HashSet<Character> s= new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            s.add(sentence.charAt(i));
        }
        if(s.size()!=26){
            ans=false;
        }
        else {
            ans=true;
        }
        return ans;
    }
}