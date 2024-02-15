class Solution {
    public int triangularSum(int[] nums) {
        int index=nums.length-1;
        int[] result = nums;
        while(result.length!=1) {
            result = next(result);
        }
        return result[0];
    }
    
    int[] next(int[] nums) {
        if(nums.length==1) {
            return nums;
        }
        
        int[] result = new int[nums.length-1];
        
        for(int i=0; i<=result.length-1;i++) {
            result[i] = (nums[i] + nums[i+1])%10;
        }
        
        return result;
        
        
    }
}