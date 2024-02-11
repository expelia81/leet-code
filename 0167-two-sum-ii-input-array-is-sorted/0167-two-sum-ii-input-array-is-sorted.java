class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int[] result = {-1,-1};
        
        while(right-left != 0) {
            
            int mid=left+(right-left)/2;
            int sum = nums[left]+nums[right];
            
            System.out.println(left+" - "+mid+" - "+right + " sum : "+sum);
            if(sum==target) {
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
            
            if(sum>target) {
                right--;
            } else {
                left++;
            }
        }
        
        
        
        return result;
        // return brute(nums,target,nums.length-1);
    }
    
    
    int[] brute(int[] nums, int target, int end) {
        int[] result = {-1,-1};
        for(int i=0;i<end;i++){
            System.out.println("i val : " + nums[i]);
            if(nums[i]+nums[end]>target) {
                continue;
            }
            int targetIndex = findSum(nums, i+1, end, target);
            if(targetIndex != -1) {
                result[0] = i+1;
                result[1] = targetIndex+1;
                return result;
            }
        }
        return result;
    }
    
    int findSum(int[] nums, int start, int end, int target) {
        int mid=-1;
        int sum = target-nums[start-1];
        while(start<=end) {
            mid = start+(end-start)/2;
            System.out.println(start+" - "+mid+" - "+end);
            if(nums[mid]==sum) {
                return mid;
            }
            
            if(nums[mid]>sum) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return -1;
    }
    
    int findEnd(int[] nums, int start, int end, int target) {
        int mid = -1;
        //하나의 해가 있다고 했으므로 타겟과 같은 값은 존재하지 않는다.
        while(start<=end) {
            mid = start+(end-start)/2;
            // System.out.println(start+" - "+mid+" - "+end);
            if(nums[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        
        return mid;
    }
}