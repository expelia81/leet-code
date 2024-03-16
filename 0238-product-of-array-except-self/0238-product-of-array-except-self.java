class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        long val=1L;
        boolean zero=false;
        
        
        
        
        for(int i : nums) {
            if(i==0) {
                if(zero) {
                    return new int[nums.length];
                }
                else zero=true;
            }
            else {
                val = val * i;
            }
        }
        
        System.out.println(val+"");
        
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(!zero) {
                result[i]=(int)(val/temp);
            } else if(temp!=0) {
                result[i]=0;
            } else {
                result[i]=(int)(val);
            }
        }
        
        return result;
    }
}