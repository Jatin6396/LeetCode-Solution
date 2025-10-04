class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
      return helper(cost,n,dp);
    }
    public static int helper(int[] cost,int n,int[] dp){
        if(n<=1) return 0;
        if(dp[n]!=-1){
            return dp[n];
        }

        return dp[n]= Math.min(cost[n-1]+helper(cost,n-1,dp),cost[n-2]+helper(cost,n-2,dp));
    }
}