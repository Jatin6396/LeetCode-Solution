class Solution {
    public static int helper(int sr,int sc,int er,int ec){
        if(sr==er && sc==ec) return 1;

        if(sr<0 || sc<0 || sr>er || sc>ec) return 0;

        int[] dirr={0,1};
        int[] dirc={1,0};

        int ans=0;
        for(int i=0;i<2;i++){
            ans+=helper(sr+dirr[i],sc+dirc[i],er,ec);
        }

        return ans;
        

    }
    public int uniquePaths(int m, int n) {
        
        return helper(0,0,m-1,n-1);
    }
}