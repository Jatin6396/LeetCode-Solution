class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
        
    }
    public static boolean helper(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char ch ='1';ch<='9';ch++){
                        if(isSafe(board,i,j,ch)){
                            board[i][j]=ch;
                            if(helper(board)) return true;
                            board[i][j]='.';
                        }
                    }
                    return false;

                }
            }
        }
        return true;
    }

    public static boolean isSafe(char[][] board,int i,int j,char ch){
        for(int k=0;k<9;k++){
            if(board[i][k]==ch) return false;
            if(board[k][j]==ch) return false;
            if(board[3*(i/3)+k/3][3*(j/3)+k%3]==ch) return false;
        }
        return true;
    }
}