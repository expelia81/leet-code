class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++) {
            if(find(nums2, nums1[i])) {
                return nums1[i];
            }
            
        }
        return -1;
    }
    
    public boolean find(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        
        while(left<=right) {
            int mid = left + (right-left)/2;
            
            int result = nums[mid];
            
            if(result==target) return true;
            
            if(result < target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return false;
    }
    
}