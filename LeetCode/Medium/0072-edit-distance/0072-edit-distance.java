class Solution {

    public static int helper(int cnt,String word1, String word2){
        if(word1.length()==0 && word2.length()==0) return 0;
        if(word1.length()==0 && word2.length()!=0) return word2.length();
        if(word1.length()!=0 && word2.length()==0) return word1.length();

      char ch1=word1.charAt(0);
      char ch2=word2.charAt(0);

      if(ch1==ch2){
        return helper(cnt,word1.substring(1),word2.substring(1));
      }
      else{
        int in=helper(cnt+1,word1.substring(1),word2);
        int de=helper(cnt+1,word1,word2.substring(1));
        int re=helper(cnt+1,word1.substring(1),word2.substring(1));
        return Math.min(in,Math.min(de,re))+1;
      }
    }
    public int minDistance(String word1, String word2) {

      int n=word1.length();
      int m=word2.length();

     // int[] dp=new int[n+1][m+1];

    //   for(int[] row:dp){
    //     Arrays.fill(row,-1);
    //   }

      int ans=helper(0,word1,word2);  
      System.out.println(ans);
      return ans;
    }
}