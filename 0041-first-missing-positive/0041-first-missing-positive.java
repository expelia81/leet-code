class Solution {
    public int firstMissingPositive(int[] nums) {
        int min=0;
        
        Arrays.sort(nums);
        
        for(int i : nums) {
            if(i > 0) {
                if(i==min+1) {
                    min = i;
                }
            }
        }
        
        // if(min!=Integer.MAX_VALUE) return min;
            
        return min+1;
    }
}