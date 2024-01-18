

class NumArray {


    public final int[] arr;

    public NumArray(int[] nums) {
        arr = nums;
    }
    
    public int sumRange(int left, int right) {
        // Arrays.stream(arr)

        int start = arr[left];
        int end = arr[right];

        int returnValue = 0;

        if (left <= right) {
            for(int i=left; i<=right; i++){
                returnValue += arr[i];
            }
        }

        return returnValue;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */