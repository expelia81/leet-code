class Solution {
    int temp = -1;
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end) {
            //혹시, 중복이 있어 정렬을 확인할 수 없는 상태라면 중복을 좀 제거해준다.
            int mid = start+(end-start)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[mid]) {
                start++;
                continue;
            }

            // 시작점과 중간지점의 정렬상태를 확인한다. (여기만 확인하면 뒷부분은 알아서 나온다.)
            if(nums[start] < nums[mid]) {
                //정렬되어있다면, 이 사이에 target이 있는지 확인한다.
                if(nums[start] <= target && nums[mid] > target) {
                    end = mid-1; //그럼 타겟 범위를 이 안으로 좁힌다.
                } else { //아니라면 범위를 밖으로 좁힌다.
                    start = mid+1;
                }
                
            } else { //시작점이 정렬되어있지 않다면....? 뒷부분은 정렬되어있겠지
                if(nums[mid] < target && nums[end] >= target) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
    
        return false;
    }
}
