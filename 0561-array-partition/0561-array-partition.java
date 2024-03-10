class Solution {
    public int arrayPairSum(int[] arr) {
        
        Arrays.sort(arr);
        int result = 0;
        for(int i=0;i<arr.length/2;i++) {
            result += Math.min(arr[i*2],arr[i*2+1]);
        }
        
        return result;
    }
}