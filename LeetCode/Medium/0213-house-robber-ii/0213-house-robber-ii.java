class Solution {

    public static int helper(int[] nums,int n,int i,int[] dp){
        if(i>=n) return 0;

        if(dp[i]!=-1){
            return dp[i];
        }

        return dp[n]=Math.max(nums[i]+helper(nums,n,i+2,dp),helper(nums,n,i+1,dp));
    }
    public int rob(int[] nums) {
        
        int n=nums.length;
        if(n==1) return nums[n-1];
        int[] dp1=new int[n+1];
        int[] dp2=new int[n+1];
         Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(helper(nums,n-1,0,dp1),helper(nums,n,1,dp2));
        
    }
}