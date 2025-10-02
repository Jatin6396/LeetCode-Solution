class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        List<String> ans=new ArrayList<>();

        helper(n,"",ans,0,0);
        return ans;

    }
    public static void helper(int n,String res,List<String> ans,int l,int r){
        if(l+r==2*n){
            ans.add(res);
        }

        if(l<n){
           res+="(";
            helper(n,res,ans,l+1,r);
            res=res.substring(0,res.length()-1);
        }

        if(r<l){
            res+=")";
            helper(n,res,ans,l,r+1);
            res=res.substring(0,res.length()-1);
        }
    }

}