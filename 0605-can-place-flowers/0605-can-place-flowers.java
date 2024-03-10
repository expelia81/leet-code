class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //3칸 연속 비어있어야 하나를 심을 수 있음.
        //5칸이 비어있다면 2개
        // empty(n) = 2n+1;
        // 만약, empty(n) 안에 시작점이나 끝점이 포함되어있다면 규칙이 변경된다.
        // empty(n) = 2n;
        if(n==0) return true;
        if(flowerbed.length==1) {
            int result = flowerbed[0];
            if(n==1 && result==0) {
                return true;
            } else {
                return false;
            }
        }
        
        
        int isStartOrEnd = 0;
        int empty = 0;
        
        int result = 0;
        
        for(int i=0;i<flowerbed.length;i++) {
            if(i==0 && flowerbed[0]==0) {
                isStartOrEnd++;
                empty++;
                continue;
            }
            if(flowerbed[i]==0){
                empty++;
                continue;
            } else {
                if(isStartOrEnd != 0) {
                    result += empty/2;
                    isStartOrEnd = 0;
                    empty=0;
                } else {
                    result += (empty-1)/2;
                    isStartOrEnd = 0;
                    empty=0;
                }
            }
        }
        
        if(flowerbed[flowerbed.length-1]==0){
            isStartOrEnd++;
        }
        
        
        if(isStartOrEnd == 2) {
            result += (empty+1)/2;
        } else if(isStartOrEnd==1) {
            result += (empty)/2;
        } else {
            result += (empty-1)/2;
        }
        
        System.out.println(result+"");
        
        
        
        return result>=n;   
    }
}