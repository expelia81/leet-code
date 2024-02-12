class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // n logn도 상관없으려나
        
        // n log n 도 상관없다면 브루트 + bs로 가능할 듯
        
        boolean result = false;
        
        for(int[] arr : matrix) {
            result = bs(arr, target);
            if(result) return true;
        }
        return result;
        
    }
    
    boolean bs(int[] arr, int target) {
        int start=0;
        int end = arr.length-1;
        
        while(start<=end) {
            int mid = start+(end-start)/2;
            System.out.println(start+" - "+mid+" - "+end);
            System.out.println("arr[mid] - "+arr[mid]);
            if(arr[mid]==target) {
                return true;
            }
            
            if(arr[mid]<target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
        return false;
    }
}