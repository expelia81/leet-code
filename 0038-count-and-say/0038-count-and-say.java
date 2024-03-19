class Solution {
    public String countAndSay(int n) {
        
        int now =1;
        
        String s = "1";
        
        while (now!=n) {
            now++;
            s=temp(s);
        }
        
        
        return s;
    }
    
    
    public String temp(String s) {
        
        String[] arr = s.split("");
        
        StringBuilder builder = new StringBuilder();
        
        int count = 1;
        String temp = arr[0];
        
        for(int i=1; i<arr.length;i++) {
            String t = arr[i];
            if(t.equals(temp)) {
                count++;
            } else {
                builder.append(count+temp);
                count=1;
                temp=t;
            }
        }
        builder.append(count+temp);
        
        return builder.toString();
    }
}