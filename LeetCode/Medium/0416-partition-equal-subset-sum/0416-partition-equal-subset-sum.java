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
        
        Boolean[][] dp=new Boolean[nums.length+1][total];
        total=total/2;

        return helper(nums,total,0,dp);
    }
}