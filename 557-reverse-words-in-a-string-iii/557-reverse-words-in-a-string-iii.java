class Solution {
    public String reverseWords(String s) {
        String result = "";
        int k=0;
        String[] array = s.split(" ");

        for(String str : array){
            result= result+ reverse(str);
            result=result+" ";
        }

        return result.trim();
        
    }
    static String reverse(String s){
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result= result+s.charAt(i);
        }
        return result;
    }
}