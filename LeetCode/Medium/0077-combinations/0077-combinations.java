class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        helper(ls,ans,n,k,1);
        return ls;
    }

    public static void helper( List<List<Integer>> ls, List<Integer> ans,int n, int k,int i){
        if(ans.size()==k){
            ls.add(new ArrayList<>(ans));
            return;
        }

        for(int j=i;j<=n;j++){
        ans.add(j);
        helper(ls,ans,n,k,j+1);
        ans.remove(ans.size()-1);
        }



    }
}