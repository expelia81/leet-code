class Solution {
    public int maxArea(int[] height) {
        //brute
//         int result = 0;
//         for(int left = 0; left < height.length-1; left++) {

//             for(int right = left+1;right<height.length; right++) {
//                 int h = Math.min(height[left],height[right]);
            
//                 int length = right - left;
                
//                 // System.out.println("left : " + left+"/"+height[left] + " - right : "+ right+"/" + height[right] + " - result : " + length*h);
                
//                 result = Math.max(result, length*h);
//             }
//         }
//         return result;
        //two pointer
        int left = 0;
        int right = height.length-1;
        
        int result = 0;
        
        while(left != right) {
            int h = Math.min(height[left],height[right]);
            
            boolean isBigLeft = height[left] >= height[right];
            
            int length = right - left;
            
            result = Math.max(result, length * h);
            
            if(isBigLeft) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}