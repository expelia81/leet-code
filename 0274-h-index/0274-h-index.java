class Solution {
    public int hIndex(int[] input) {
        // 정렬시키고 하면 N logN이 나오는데... 이거보다 빠를 수 있나
        
        // 카운팅정렬 시킨 후, 카운팅 정렬 결과물에서 자신 인덱스보다 큰 것이 h 인덱스 후보인데, 그중 제일 큰 것 찾으면 됨.
        
        
        int[] count = new int[1000];
        
        for(int i : input) {
            count[i]++;
        }
        
        int sum = 0;
        
        for(int i=count.length-1;i>=1;i--) {
            sum += count[i];
            if(sum!=0) {
                System.out.println("sum : " + sum);
            }
            count[i] = sum;
        }
        int result = 0;
        for(int i=0;i<count.length;i++) {
            if(i<=count[i]) {
                result = i;
            }
        }
        return result;
    }
    
}