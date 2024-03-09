class Solution {
    Set<Character> set = new HashSet<>();
    public boolean isValidSudoku(char[][] board) {
        /*
            가로합 45 세로합 45
            f(3,3), f(3,6),f(3,9)
            f(6,3), f(6,6) f(9,6)
            f(9,3), f(9,6),f(9,9)
        */
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                if(validate(board,i,j)) return false;
            }
            set.clear();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                if(validate(board,j,i)) return false;
            }
            set.clear();
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                
                for(int x=i*3;x<i*3+3;x++){
                    for(int y=j*3;y<j*3+3;y++){
                        if(validate(board,x,y)) return false;
                    }
                }
                set.clear();
            }
        }
        
        
        return true;
    }
    
    
    boolean validate(char[][] board, int i, int j) {
        if(board[i][j] != '.') {
            if(set.contains(board[i][j])) {
                System.out.println("value : " + board[i][j] + " - i " + i + " - j " + j);
                return true;
            }
            set.add(board[i][j]);
        }
        
        return false;
    }
}