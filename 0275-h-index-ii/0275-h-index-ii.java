class Solution {
    public int hIndex(int[] arr) {
        // h-index란, h회 이상 인용된 논문을 h개 이상 가지고있을 때를 말한다.
        // 오름 차순으로 정렬되어있으므로, h는 arr.length-mid가 된다. 이 때, arr[mid]가 h 이상이면 된다.
        // 앞에서부터 검증하면 반드시 최대값이 된다.
        
        
        int start = 0;
        int end = arr.length-1;
        int h = 0;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            int temp = arr.length-mid;
            
            System.out.println(start+" - "+mid+" - "+end);
            
            // h보다 큰 값이 mid라면, h값이 정해진다.
            if(arr[mid]>=temp) {
                h=temp;
            }
            
            if(arr[mid] < temp) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        
        return h;
    }
}