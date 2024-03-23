class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int result = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-2;i++) {
            int left = i+1;
            
            int right = nums.length-1;
            
            int val = nums[i];
            
            while(left<right) {
                // System.out.println("i : "+i+" / left : " + left + " / right : " + right);
                
                int leftVal = nums[left];
                int rightVal = nums[right];
                
                int sum = val + leftVal + rightVal;
                int tempSum = Math.abs(sum-target);
                int temp = Math.abs(result-target);
                // System.out.println("val : "+val+" / left : " + leftVal + " / right : " + rightVal);
                if(tempSum<temp) {
                    // System.out.println(temp +" : " +tempSum);
                    result=sum;
                    // System.out.println("result : " + result);
                }
                if(sum>target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        
        return result;
    }
}