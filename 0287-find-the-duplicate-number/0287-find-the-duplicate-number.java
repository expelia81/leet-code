class Solution {
    public int findDuplicate(int[] nums) {
        int[] counts = new int[nums.length];
        
        
        for(int i : nums) {
            counts[i]++;
            if(counts[i] > 1) {
                return i;
            }
        }
        
        return 0;
    }
}