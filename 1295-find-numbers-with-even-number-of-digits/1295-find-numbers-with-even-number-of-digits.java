class Solution {
    public int findNumbers(int[] nums) {
        
        int k=0;
        for(int i=0;i< nums.length;i++){
            if(even(nums[i])){
                k++;
            }

        }
        return k;
    }
    static boolean even(int n){
        boolean ans= true;
        int count=0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        if(count%2==0){
            ans =true;
        }
        else{
            ans=false;
        }
        return ans;
    }
}