class Solution {
    public static int helper(int sr,int sc,int er,int ec,int[][] arr,int[][] dp){
        if(sr==er && sc==ec) return 1;

        if(sr<0 || sc<0 || sr>er || sc>ec || arr[sr][sc]!=0) return 0;

        int[] dirr={0,1};
        int[] dirc={1,0};
         if(dp[sr][sc]!=-1) return dp[sr][sc];

        int ans=0;
        arr[sr][sc]=1;
        for(int i=0;i<2;i++){
            ans+=helper(sr+dirr[i],sc+dirc[i],er,ec,arr,dp);
        }
         arr[sr][sc]=0;

        return dp[sr][sc]=ans;
        

    }
    public int uniquePathsWithObstacles(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        if(mat[0][0]==1 || mat[n-1][m-1]==1) return 0;
        int[][] dp=new int[n][m];
        for(int[] r:dp)
        Arrays.fill(r,-1);

        return helper(0,0,n-1,m-1,mat,dp);
    }
}