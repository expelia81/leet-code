class Solution {
    public int longestPalindrome(String s) {
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        String[] arr = s.split("");
        
        int result = 0;
        boolean odd = false;
        
        for(String temp : arr) {
            if(map.containsKey(temp)) {
                map.put(temp,map.get(temp)+1);
            } else {
                map.put(temp,1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if(v>1) {
                result += v - v%2;
            }
            if(v%2==1) {
                odd = true;
            }
        }
            
        if(odd) return result+1;
        
        return result;
    }
}