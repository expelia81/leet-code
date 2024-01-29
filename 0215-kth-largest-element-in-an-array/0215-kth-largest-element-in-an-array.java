class Solution {
    public int findKthLargest(int[] nums, int k) {
		List<Integer> list = Arrays.stream(nums)
						.sorted()
						.boxed().toList();
        
        return list.get(list.size() - k);
            
    }
}