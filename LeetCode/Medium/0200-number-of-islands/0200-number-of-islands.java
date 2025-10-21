class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }

    public boolean check(int i,int j,char[][] grid){
        return i>=0 && j>=0 && i<grid.length && j<grid[0].length;
    }

    public void bfs(char[][] grid,int startRow,int startCol){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startRow,startCol));
             grid[startRow][startCol] = '0'; 
        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};

        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;

            for(int k=0;k<4;k++){
                int nr = r + dr[k];
                int nc = c + dc[k];
                if(check(nr,nc,grid) && grid[nr][nc]=='1'){
                    grid[nr][nc]='0';
                    q.add(new Pair(nr,nc));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='0';
                    cnt++;
                    bfs(grid,i,j);
                }
            }
        }
        return cnt;
    }
}
