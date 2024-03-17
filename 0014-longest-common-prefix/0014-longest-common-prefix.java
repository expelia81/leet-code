class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int length = strs[0].length();
        String result = "";
        boolean checker = false;
        for(int i=0;i<length;i++) {
            char c = strs[0].charAt(i);
            
            for(int j=1; j<strs.length; j++) {
                if(strs[j].length()<i+1 || strs[j].charAt(i)!=c) {
                    checker = false;
                    break;
                } else {
                    checker = true;
                }
            }
            
            if(checker) {
                result = result+c;
                checker = false;
            } else {
                break;
            }
        }
        
        return result;
    }
}