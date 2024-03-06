class Solution {
    public int strStr(String haystack, String needle) {
        String[] hay = haystack.split("");
        String[] nee = needle.split("");
        for(int i=0;i<haystack.length()-needle.length()+1;i++) {
            
            boolean result = false;
            int index = 0;
            for(int j=i;j<i+nee.length; j++) {
                    System.out.println(i + "-" + index);
                if(hay[i+index].equals(nee[index])){
                    result = true;
                } else {
                    result = false;
                    index=0;
                    break;
                }
                index++;
            }
            if(result) return i;
        }
        return -1;
    }
}