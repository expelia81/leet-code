class Solution {
    
    List<List<Integer>> RESULT = new ArrayList<>();
    
    Set<String> combination = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates, target, 0, "",1);
        return RESULT;
    }
    
    
    public void find(int[] arr, int target, int value, String result, int last) {
        for(int i : arr){
            if(i<last) continue;
            int temp = value+i;
            if(temp==target) {
                addResult(result+","+i);
            }
            if(temp<target) {
                find(arr,target,temp,result+","+i,i);
            }
        }
    }
    
    void addResult(String target) {
        List<Integer> list = new ArrayList<>();
        if(target.isEmpty()) return;
        target=target.replaceFirst(",","");
        for(String s : target.split(",")) {
            list.add(Integer.valueOf(s));
        }
        RESULT.add(list);
    }
}