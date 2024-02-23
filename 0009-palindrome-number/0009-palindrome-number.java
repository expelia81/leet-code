class Solution {
    public boolean isPalindrome(int x) {
     String s = ""+x;
        
        int left = 0;
        int right = s.length()-1;
        
        String[] arr = s.split("");
        int mid = left+(right-left)/2;
        while(left<=mid) {
            if(arr[left].equals(arr[right])) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}