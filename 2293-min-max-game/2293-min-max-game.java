class Solution {
    public int minMaxGame(int[] nums) {
        // 이진법으로 합쳐서, i가 0 이하
        if(nums.length==1) return nums[0];
        
        while(nums.length!=1) {
            nums = game(nums);
        }
        
        return nums[0];
    }
    
    
    int[] game(int[] nums) {
        int[] result = new int[nums.length/2 + nums.length%2];
        for(int i=0; i<result.length; i++) {
            if(i%2==0) {
                result[i]=Math.min(nums[i*2],nums[i*2+1]);
            } else {
                result[i]=Math.max(nums[i*2],nums[i*2+1]);
            }
        }
        for(int i : result) {
            System.out.println(i);
        }
        
        return result;
    }
}