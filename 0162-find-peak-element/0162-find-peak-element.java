class Solution {
    public int findPeakElement(int[] nums) {
        int start = 1;
        int end = nums.length-2;
        if(nums.length==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[nums.length-1] > nums[nums.length-2]) return nums.length-1;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(start==end) return mid;
            
            
            // mid가 peak인지 확인해본다. 이미 양쪽끝단은 잘라냈으므로, 유효성은 신경안써도된다.
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) return mid;
            
            // peak이 아니라면, 현재 mid의 진행방향을 확인해본다.
            // 진행 방향이 상승중이라면, 뒤쪽에 반드시 peak이 존재한다.
            if(nums[mid] > nums[mid-1]) {
                start = mid+1;
                continue;
            }
                
            // 진행 방향이 하락중이라면, 앞쪽에 반드시 peak이 존재한다.(nums[mid] > nums[mid+1])
            else {
                end = mid-1;
                continue;
            }
        }
        
        return -1;
    }
}