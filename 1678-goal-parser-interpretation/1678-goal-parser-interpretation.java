class Solution {
    public String interpret(String command) {
       String str="";
        int i=0;

        while(i<=command.length()-1){
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)=='a'){
                    str=str+"al";
                    i=i+4;
                } else if (command.charAt(i+1)==')') {
                    str=str+"o";
                    i=i+2;
                }
            }
            else{
                str=str+"G";
                i=i+1;
            }
        }
        return str;
    }
}