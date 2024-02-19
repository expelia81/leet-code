class Solution {
    Set<String> set = new HashSet<>();
    public boolean isPathCrossing(String path) {
        String[] arr = path.split("");
        int x = 0;
        int y = 0;
        set.add("0-0");
        for(int i=0; i<arr.length; i++) {
            String s = arr[i];
            if(s.equals("N")){
                String key = getKey(x,++y);
                if(set.contains(key)) return true;
                set.add(key);
            } else if(s.equals("S")){
                String key = getKey(x,--y);
                if(set.contains(key)) return true;
                set.add(key);
            } else if(s.equals("E")) {
                String key = getKey(++x,y);
                if(set.contains(key)) return true;
                set.add(key);
            } else {
                String key = getKey(--x,y);
                if(set.contains(key)) return true;
                set.add(key);
            }
        }
        
        return false;
        
    }
    
    private String getKey(int x, int y){
        return x+"-"+y;
    } 
}