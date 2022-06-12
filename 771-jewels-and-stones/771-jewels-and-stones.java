class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(char character: jewels.toCharArray()){
            set.add(character);
        }
        for(char character: stones.toCharArray()){
            if(set.contains(character)){
                count++;
            }
        }
        return count;
    }
}