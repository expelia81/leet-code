class Solution {
    int[][] arr = null;
    public int minimumTotal(List<List<Integer>> triangle) {
        int result = 10000000;
        int length = triangle.size();
        arr = new int[triangle.size()][triangle.size()];
        
        // for 반복문을 이용하여 모든 요소를 max값으로 초기화
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.MAX_VALUE;
            }
        }
        
        arr[0][0] = triangle.get(0).get(0);

        for(int i=1;i<length;i++) {
            for(int j=0;j<=i;j++) {
                if(j==0) {
                    arr[i][j] = arr[i-1][j]+triangle.get(i).get(j);
                } else 
                arr[i][j] = Math.min(arr[i-1][j],arr[i-1][j-1]) + triangle.get(i).get(j);
            }
        }
        
        for(int i=0; i<length;i++){
            int val = arr[length-1][i];
            result = Math.min(val,result);
        }
        
        return result;
    }
}