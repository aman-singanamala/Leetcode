class Solution {
    public String sortSentence(String s) {
        String array[] = s.split(" "); // convert the string into array inoring spaces
        String temp[]= new String[array.length];
        String result="";
        for(int i=0;i<array.length;i++){
            // get the number at last index of the string
            int index= array[i].charAt(array[i].length()-1)-'0';
            //putting the string into temp
            temp[index-1]= array[i].substring(0,array[i].length()-1);
        }
        for(int i=0;i< temp.length;i++){
            result=result+temp[i]+" ";
        }
        return result.trim();
    }
}