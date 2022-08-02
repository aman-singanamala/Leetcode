class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets= new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;

        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while (j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                } else if (nums[i]+nums[j]+nums[k]<0) {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return triplets;
    }
}