class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        1. 행별로 나누어 2진 탐색해서 자신이 속한 행 탐색
        2. 행 내에서 2진 탐색해서 자기 자신 탐색
        */
        int targetRow = findTargetRow(matrix, 0, matrix.length-1, target);
        System.out.println("find row : "+targetRow);
        
        int end = matrix[0].length-1;
        System.out.println("find length : " + end);
        if(end==0) {
            return matrix[targetRow][0] == target;
        }
        
        return findTarget(matrix[targetRow], 0, end, target);
    }
    
    // 이진탐색을 끝까지 수행해도 찾지 못할 경우, 끝단을 row를 반환한다.
    int findTargetRow(int[][] matrix, int start, int end, int target) {
        int mid = (start+end)/2;
        System.out.println(start + " - " + mid + " - " + end);
        if(mid==end) return mid;
        if(mid==start) {
            if(matrix[mid+1][0] > target) {
                return mid;
            } else {
                return mid+1;
            }
        };
        if(matrix[mid][0] > target && matrix[mid-1][0] <= target) {
            return mid-1;
        } else {
            if(matrix[mid][0] > target) {
                return findTargetRow(matrix, start, mid, target);    
            } else {
                return findTargetRow(matrix, mid, end, target);
            }
        }
    }
    
    boolean findTarget(int[] matrix, int start, int end, int target) {
        
        int mid = (start+end)/2;
        System.out.println(start + " - " + mid + " - " + end);
        if(start>end) return false;
        if(target==matrix[mid]) return true;
        if(matrix[mid] > target) {
            return findTarget(matrix, start, mid-1, target);
        } else {
            return findTarget(matrix, mid+1, end, target);
        }
    }
}