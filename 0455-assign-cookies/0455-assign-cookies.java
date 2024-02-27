class Solution {
    public int findContentChildren(int[] g, int[] s) {
        List<Integer> children = new ArrayList<>();
        for(int i : g) {
            children.add(i);
        }
        children.sort(Comparator.comparingInt(o -> o));
        
        
        
        List<Integer> list = new ArrayList<>();
        for(int i : s) {
            list.add(i);
        }
        list.sort(Comparator.comparingInt(o -> o));
        
        int result = 0;
        
        for(int i : children) {
            for(int j=0;j<list.size();j++){
                if(list.get(j)>=i) {
                    list.remove(j);
                    result++;
                    break;
                }
            }
        }
        
        return result;
    }
}