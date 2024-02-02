class Solution {
    public int search(int[] nums, int target) {
        

        int start = 0;
        int end = nums.length-1;
        
        if(nums.length==1) {
            return nums[0]==target ? 0 : -1;
        }
        
        while(true) {
            int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            
            if(start==end || end<0 || start>=nums.length) return -1;
            
            if(nums[mid]>target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
            
        }
    }
}