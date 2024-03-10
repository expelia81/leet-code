class Solution {
    public int arrayPairSum(int[] arr) {
        // arr = 
           int[] test = Arrays.stream(arr)
                .sorted()
            // .forEach(s->System.out.println(s+""));
            .toArray();
        
        // for(int i:test) {
        //     System.out.println("result : " + i);
        // }
        int result = 0;
        for(int i=0;i<arr.length/2;i++) {
            int temp = Math.min(test[i*2],test[i*2+1]);
            // System.out.println("temp : " + temp);
            result += temp;
        }
        
        return result;
    }
}