class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        String[] arr = s.split("");
        
        for(int i=0;i<arr.length;i++) {
            String temp = arr[i];

            if(map.containsKey(temp)) {
                count=0;
                i=map.get(temp);
                map.clear();
            } else {
                map.put(temp,i);
                count++;
                if(max<count) {
                    max=count;
                }
            }
        }
        return max;
    }
}