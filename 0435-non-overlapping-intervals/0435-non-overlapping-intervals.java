class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        
        
        
        //마지막에 넣은 것의 종료값보다 시작점이 작다면 겹치는 것이다.
        // 이 경우, 길이는 고려하지 않아도 된다. 왜냐하면, 시작점이 기준이 아니라 종료점이 기준이므로...? 왜???
        
        Stack<int[]> stack = new Stack<>();
        int result = 0;
        for(int[] i : intervals) {
           if(!stack.isEmpty() && i[0]<stack.peek()[1]) {
               result++;
           } else {
               stack.push(i);
           }
        }
        
        
        return result;
    }
}