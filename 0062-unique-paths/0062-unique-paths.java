class Solution {
    public int uniquePaths(int m, int n) {
        
    int[][] arr = new int[m][n];
        for(int i =0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(j==0 || i==0) {
                    arr[i][j]=1;
                } else {
                    arr[i][j]=arr[i][j-1]+arr[i-1][j];
                }
            }
        }
        return arr[m-1][n-1];
    }
    
    int func(int x, int y) {
        System.out.println(x + " -- " + y);
        
        if(x == 0 || y == 0) {
            return 1;
        }
        
        int xVal = x==0 ? 0 : func(x-1,y);
        int yVal = y==0 ? 0 : func(x,y-1);
        return xVal + yVal;
    }
}