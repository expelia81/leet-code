class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int size = 2100000000;
        int sum = 0;
        
        while(right < nums.length) {
            sum += nums[right];
            while(sum>=target){
                size = Math.min(size, right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if(size == 2100000000) return 0;
        return size;
    }
}