class Solution {
    
    int target = 0;
    public int searchInsert(int[] nums, int target) {
        
        this.target = target;
        int start = 0;
        int end = nums.length-1;
        
        return findTarget(nums,start,end);
    }
    
    public int findTarget(int[] nums, int start, int end) {
        if(start>end) return start;
        int mid = (start+end)/2;
        int search = nums[mid];
        if(search == target) return mid;
        
        if(search > target) {
            return findTarget(nums,start,mid-1);
        } else {
            return findTarget(nums,mid+1,end);
        }
        
    }
}