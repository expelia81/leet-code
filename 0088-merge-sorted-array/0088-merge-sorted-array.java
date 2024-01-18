class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // m, n은 길이?

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<m; i++) {
            list.add(nums1[i]);
        }

        for(int i=0; i<n; i++) {
            list.add(nums2[i]);
        }

        list.sort((o1, o2) -> {
            if (o1 > o2) {
              return 1;
            } else if (o1 < o2) {
              return -1;
            } else {
              return 0;
            }
        });

        for(int i=0; i< nums1.length; i++) {
            nums1[i]=list.get(i);
        }
    }
}