/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        
        
            
       return findBadVersion(1, n);
    }
    
    int findBadVersion(int start, int end) {
        
        long temp = (long)start + (long)end;
        int mid = (int)(temp/2);
        System.out.println(start + " - " + mid + " - " + end);

        if(start==end) return mid;
        // mid가 배드버전이 맞으면 앞버전 탐색
        if(isBadVersion(mid)) {
            return isBadVersion(mid-1) ? findBadVersion(start, mid-1) : mid;
        } else {
            return findBadVersion(mid+1, end);
        }
    }
}