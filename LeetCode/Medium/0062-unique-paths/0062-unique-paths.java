class Solution {
    public static int helper(int sr,int sc,int er,int ec,int[][] dp){
        if(sr==er && sc==ec) return 1;

        if(sr<0 || sc<0 || sr>er || sc>ec) return 0;

        if(dp[sr][sc]!=-1) return dp[sr][sc];

        int[] dirr={0,1};
        int[] dirc={1,0};

        int ans=0;
        for(int i=0;i<2;i++){
            ans+=helper(sr+dirr[i],sc+dirc[i],er,ec,dp);
        }

        return dp[sr][sc]=ans;
        

    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
        for(int[] r:dp)
        Arrays.fill(r,1);

        for (int i=1;i<n;i++) {
            for (int j=1;j<m;j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n-1][m-1];
        
    }
}