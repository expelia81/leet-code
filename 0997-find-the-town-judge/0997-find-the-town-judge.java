class Solution {
    public int findJudge(int n, int[][] trust) {
        int[][] count = new int[n][2];
        
        
        // count[0] 신용받은 횟수, count[1] 신용한 횟수
        
        for(int[] arr : trust) {
            count[arr[0]-1][1]++;
            count[arr[1]-1][0]++;
        }
        
        for(int i=0;i<n;i++) {
            int trusto = count[i][1];
            int trusted = count[i][0];
            
            if(trusted==n-1 && trusto ==0) {
                return i+1;
            }
        }
        
        return -1;
    }
}