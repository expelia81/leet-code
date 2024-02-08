class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int[] result = new int[n+1];
        
        for(int i=0; i<n; i++) {
            int temp = nums[i];
            result[temp]=-1;
        }
        
        for(int i=0; i<n+1; i++){
            if(result[i] != -1) {
                return i;
            }
        }
        return -1;
    }
}