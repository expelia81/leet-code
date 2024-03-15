class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        
        if(k==0) return false;
        
        while(left<=nums.length) {
            for(int i=left+1; i<nums.length;i++) {
                if(i > left+k) {
                    break;
                }
                if(nums[left]==nums[i]) {
                    if(i-left<=k){
                        return true;
                    }
                }
                
            }
            left++;
        }
        
        
        
        return false;
    }
}