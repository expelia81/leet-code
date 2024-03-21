class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        Set<String> temp = new HashSet<>();
		Arrays.sort(nums);
        
        // two pointer는 n이므로,   two pointer로 좁혀서 풀면 된다.  즉, n^2이 된다.
        
        for(int i=0; i<nums.length-2;i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i+1;
            int right = nums.length-1;
            int first = nums[i];
            while(left<right) {
                int second = nums[left];
                int third = nums[right];
                
                // first+second+third가 0인지 그보다 큰지, 작은지로 분류된다.
                int val = first+second+third;
                
                if(val==0) {
                    List<Integer> list = new ArrayList<>();
                    System.out.println("check target : " + first +" / "+second +" / " + third);
                    result.add(Arrays.asList(first,second,third));
                    
                    //skip
                    while(left<right && second==nums[left+1]) {
                        System.out.println("skip left : " + second);
                        left++;
                    }
                    while(left<right && third==nums[right-1]) {
                        System.out.println("skip right : " + third);
                        right--;
                    }
                    
                    //스킵되었기 때문에, left나 right가 하나만 변하면 무조건 0이 아니게 변화된다.
                    left++;
                    right--;
                } else if(val > 0){// 0보다 크다면 최대값을 줄여야함.
                    right--;
                } else {
                    left++;
                }
            }
            
        }   
        return result;
    }
}