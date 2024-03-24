class Solution {
    int count=0;
    public int minSwapsCouples(int[] row) {
        
        for(int i=0; i<row.length; i+=2) {
            if(!isCouple(row[i],row[i+1])) {
                swapCouple(row[i], i, row);
            }
        }
            
            
        return count;
    }
    
    
    public boolean isCouple(int val, int checkTarget) {
        System.out.println("check : " + val + " / " + checkTarget);
        return checkTarget/2 == val/2;
    }
    
    public void swapCouple(int val, int index, int[] row) {
        for(int i=index+2;i<row.length;i++) {
            if(isCouple(val,row[i])) {
                int temp = row[i];
                row[i]=row[index+1];
                row[index+1] = temp;
                count++;
                return;
            }
        }
    }
}