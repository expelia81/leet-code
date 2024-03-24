class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i : nums) {
            
            set.add(i);
        }
        
        List<Integer> list = set.stream()
            .toList();
        
        for(int i=0;i<list.size();i++) {
                nums[i]=list.get(i);    
        }
        return list.size();
    }
}