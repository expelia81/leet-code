class Solution {
    public boolean isSubsequence(String s, String t) {
        // two pointer
        String[] target = s.split("");
        String[] all = t.split("");
        
        int targetIndex = 0;
        int allIndex = 0;
        
        if(s.length()==0) {
            return true;
        }
        if(t.length()==0) {
            return false;
        }
        
        
        
        while(targetIndex != target.length && allIndex != all.length) {
            
            if(all[allIndex].equals(target[targetIndex])){
                targetIndex++;
                allIndex++;
            } else {
                allIndex++;
            }
        }
        
        
        
        if(targetIndex==target.length) {
            return true;
        }
        return false;
    }
}