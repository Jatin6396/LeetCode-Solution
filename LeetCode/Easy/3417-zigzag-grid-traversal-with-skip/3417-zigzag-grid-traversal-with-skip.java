class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ls=new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((i+j)%2==0)  ls.add(grid[i][j]);
            }
        }
        return ls;
    }
}