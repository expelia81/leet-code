class Solution {

	public int maxSubarrayLength(int[] nums, int k) {
		int left = 0;
		int result = 0;

		Map<Integer,Integer> map = new HashMap<>();

		for(int r=0;r<nums.length; r++) {
			map.put(nums[r], map.getOrDefault(nums[r],0)+1);

			while(map.get(nums[r])>k) {
				map.put(nums[left], map.get(nums[left])-1);
				left++;
			}

			result = Math.max(result, r-left+1);
		}
		return result;
	}
}