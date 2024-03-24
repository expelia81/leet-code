class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        int count = 0;
        for(int i : nums) {
            if(set.contains(i)) {
                count++;
            } else {
                set.add(i);
            }
        }
        
        List<Integer> list = set.stream()
            .toList();
        
        for(int i=0;i<list.size();i++) {
                nums[i]=list.get(i);    
        }
        return list.size();
    }
}