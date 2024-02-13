class Solution {
    public int lengthOfLIS(int[] nums) {
        // brute -> n^2
        
        int max = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1;i<nums.length; i++) {
            result[i]=1;
            for(int j=0; j<i; j++) {
                if(nums[i]>nums[j]) {
                    result[i] = Math.max(result[i],result[j]+1);
                    max = Math.max(result[i],max);
                }
            }
        }
        
        return max;
    }
}