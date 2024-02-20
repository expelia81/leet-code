class Solution {
    public int climbStairs(int n) {
        /*
            n단계는 n-1단계와 n-2단계의 합으로 이루어진다. 1단계와 2단계는 1로 처리한다.
        */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,1);
        for(int i=2;i<=n;i++) {
            if(map.containsKey(i)){
                continue;
            } else {
                map.put(i,map.get(i-2)+map.get(i-1));
            }
        }
        return map.get(n);
    }
    
    
    int f(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        
        return f(n-1)+f(n-2);
    }
}