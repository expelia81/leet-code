class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> result = new LinkedHashSet<>();
        
        for(int i : nums) {
            if(set.contains(i)) {
                result.add(i);
            } else {
                set.add(i);
            }
        }
        
        return result.stream().toList();
    }
}