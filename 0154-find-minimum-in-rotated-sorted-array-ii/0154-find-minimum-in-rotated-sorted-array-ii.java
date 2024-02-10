class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length-1;
        
        while(end - start >= 16) {
            int mid = start + (end-start)/2;
            if(nums[start] == nums[mid]) {
                start++;
                continue;
            }
            if(nums[start] > nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        return brute(start, end, nums);
    }
    
    public int brute(int start, int end, int[] nums) {
        
        int min = 5001;
        for(int i=start; i<=end; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }
}