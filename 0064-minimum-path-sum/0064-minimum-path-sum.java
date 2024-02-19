class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m][n];
        for(int i=0; i<m; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }
        
        for(int i =0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(i==0 && j==0){
                    result[i][j]=grid[i][j];
                } else if(i==0) {
                    result[i][j]=result[i][j-1]+grid[i][j];
                } else if(j==0) {
                    result[i][j]=result[i-1][j]+grid[i][j];  
                } else {
                    int x= result[i-1][j] + grid[i][j];
                    int y= result[i][j-1] + grid[i][j];
                    result[i][j] = Math.min(x,y);
                }
            }
        }
        return result[m-1][n-1];
    }
}