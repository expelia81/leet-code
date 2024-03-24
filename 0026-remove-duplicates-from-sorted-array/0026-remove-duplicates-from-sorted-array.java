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
        
        System.out.println(list.size());
        
        // nums = new int[list.size()];
        
        for(int i=0;i<nums.length;i++) {
            if (i<list.size()) {
                nums[i]=list.get(i);    
            }
            else {
                nums[i]=0;
            }
            
        }
        
        for(int i : nums) {
            System.out.print(" / " + i);
        }
        return list.size();
    }
}