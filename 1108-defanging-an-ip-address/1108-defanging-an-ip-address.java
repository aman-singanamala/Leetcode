class Solution {
    public String defangIPaddr(String address) {
        if(address==null||address.indexOf('.')<0){
                return address;
            }
            else{
                return address.replaceAll("\\.","[.]");
            }
    }
}