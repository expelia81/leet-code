/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        
        int start = 1;
        int end = n;
        
        while(start<=end) {
            int mid = start+(end-start)/2;
            int result = guess(mid);
            System.out.println(start+"-"+mid+"-"+end+"-result:"+result);
            
            switch(result) {
                    
                case 1 : start = mid+1; break;
                    
                case 0 : return mid;
                    
                case -1 : end = mid - 1;
            }
        }
        
        return 0;
        
    }
}