class Solution {
    public static boolean helper(int[] nums,int total,int i,Boolean[][]dp){
            if(total==0) return true;
            if(total<0 || i>=nums.length) return false;
        if(dp[i][total]!=null) return dp[i][total];

        boolean take=helper(nums,total-nums[i],i+1,dp);
      
        

        return dp[i][total]=take|| helper(nums,total,i+1,dp);
    }
    public boolean canPartition(int[] nums) {
      

        int total=0;
        for(int i:nums){
            total+=i;
        }
        
        if(total%2!=0) return false;
        int n=nums.length;
        int m=total/2;
        boolean [][]dp=new boolean[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
            
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j]|| dp[i-1][j-nums[i-1]];
                }// pick
                else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }
        return dp[n][m];
        
    }
}