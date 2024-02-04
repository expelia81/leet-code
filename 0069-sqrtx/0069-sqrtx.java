class Solution {
    public int mySqrt(int x) {
        // x는 int의 최댓값이므로, 나올 수 있는 최대 제곱값은 2^16-1이다.
        
        int max = 65535;
        
        
        int start = 0;
        int end = 46340;
        
        return findSqrt(0,end, x);
    }
    
    public int findSqrt(int start, int end, int target) {
        
        
        int mid = (start+end)/2;
        
        if(start>end) return mid;
        
        int nextMid = mid+1;
        int midSqrt = mid*mid;
        if(midSqrt <= target) {
            if((nextMid*nextMid) > target) {
                return mid;    
            }
            else return findSqrt(mid+1, end, target);
            
        } else {
            return findSqrt(start, mid-1,target);
        }
        
    }
}