class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j=j+2){
                int[] copy= Arrays.copyOfRange(arr, i, j + 1);
                for(int k = 0; k<copy.length; k++){
                    sum += copy[k];
                }
            }
        }
        return sum;
    }
}