class Solution {

    public static int helper(String word1, String word2,int[][] dp){
        if(word1.length()==0 && word2.length()==0) return 0;
        if(word1.length()==0 && word2.length()!=0) return word2.length();
        if(word1.length()!=0 && word2.length()==0) return word1.length();

      char ch1=word1.charAt(0);
      char ch2=word2.charAt(0);
      if(dp[word1.length()][word2.length()]!=-1){
        return dp[word1.length()][word2.length()];
      }

      if(ch1==ch2){
        return dp[word1.length()][word2.length()]= helper(word1.substring(1),word2.substring(1),dp);
      }
      else{
        int in=helper(word1.substring(1),word2,dp);
        int de=helper(word1,word2.substring(1),dp);
        int re=helper(word1.substring(1),word2.substring(1),dp);
        return dp[word1.length()][word2.length()]=Math.min(in,Math.min(de,re))+1;
      }
    }
    public int minDistance(String word1, String word2) {

      int n=word1.length();
      int m=word2.length();

     int[][] dp=new int[n+1][m+1];

     for(int[] row:dp)
      Arrays.fill(row,-1);

      int ans=helper(word1,word2,dp);  
      System.out.println(ans);
      return ans;
    }
}