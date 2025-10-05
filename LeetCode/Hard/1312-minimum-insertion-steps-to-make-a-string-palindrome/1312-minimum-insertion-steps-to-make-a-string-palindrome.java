class Solution {
     public static int helper(int n,int m,String text1, String text2,int[][] dp){
        if(n==0 || m==0) return 0;

        if(dp[n][m]!=-1){
            return dp[n][m];
        }

        if(text1.charAt(n-1)==text2.charAt(m-1)){
            return dp[n][m]=1+helper(n-1,m-1,text1,text2,dp);
        }
            else{
                return dp[n][m]=Math.max(helper(n-1,m,text1,text2,dp),helper(n,m-1,text1,text2,dp));
            }
        
    }
    public int minInsertions(String s) {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }

        int n=s.length();
        int m=s.length();
        int[][] dp=new int[n+1][m+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        int ans= helper(n,m,s,str,dp);
        return n-ans;
    }
}