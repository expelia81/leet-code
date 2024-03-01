class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> set = new ArrayList<String>();
        
        findTree(set,0,0,n,"");
        
        
        return set;
        
    }
    
    void findTree(List<String> set, int left, int right, int n, String result) {
        if(result.length()==n*2) {
            set.add(result);
        }
        if(left<n) {
            findTree(set,left+1,right,n,result+"(");
        }
        
        if(right<left) {
            findTree(set,left,right+1,n,result+")");
        }
    }
}