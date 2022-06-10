class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        for(int i=0;i< nums1.length;i++){
            set1.add(nums1[i]);
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
            }
        }
        int[] array= new int[set2.size()];
        int j=0;
        for(int i : set2){
            array[j++]=i;
        }
        return array;
    }
}