class Solution {
    public int[] runningSum(int[] nums) {
        int[] temp = new int[nums.length];
        int j=0;
        int sum=0;
        for(int i=0;i< nums.length;i++){
            sum=sum+nums[i];
            temp[j++]=sum;
        }
        return temp;
    }
}