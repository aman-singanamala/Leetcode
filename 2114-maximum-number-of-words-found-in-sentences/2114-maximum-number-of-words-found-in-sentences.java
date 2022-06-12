class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(int i=0;i< sentences.length;i++){
            int x= countWords(sentences[i]);
            if(x>maxWords){
                maxWords=x;
            }
        }
        return maxWords;
    }
    public int countWords(String sentence) {
        int n= sentence.length();
        if(n==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(sentence.charAt(i)==' '){
                count++;
            }
        }
        return count+1; // for n spaces there will be n+1 words in a sentence
    }
}