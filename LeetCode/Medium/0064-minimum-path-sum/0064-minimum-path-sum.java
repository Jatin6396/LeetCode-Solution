class Solution {
    public static int helper(int sr,int sc,int er,int ec,int[][] grid){
        if(sr==er-1 && sc==ec-1){
            return grid[sr][sc];
        }
         if( sr>=er || sc>=ec ) return Integer.MAX_VALUE;;
        
        return grid[sr][sc]+Math.min(helper(sr+1,sc,er,ec,grid),helper(sr,sc+1,er,ec,grid));

       
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }
        
        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        
        return grid[m-1][n-1];
    }
}