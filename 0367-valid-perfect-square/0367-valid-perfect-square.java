class Solution {
    public boolean isPerfectSquare(int num) {
        int max = 46340;
        
        int start = 0;
        int end = 46340;
        
        while(start <= end) {
            int mid = start + (end-start)/2;
            System.out.println(start+" - "+mid+" - "+end);
            if(start==end) {
                if(mid*mid == num) return true;
                else {
                    return false;
                }
            } 
            
            if(mid*mid == num) return true;
            
            if(mid*mid > num) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
}