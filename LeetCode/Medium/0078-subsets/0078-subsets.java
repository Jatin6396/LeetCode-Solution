class Solution {

    public static void helper( List<List<Integer>> ls, List<Integer> ans,int[] nums,int i){
        if(i>=nums.length){
            ls.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        helper(ls,ans,nums,i+1);
        ans.remove(ans.size()-1);
        helper(ls,ans,nums,i+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();

        List<Integer> ans=new ArrayList<>();

        helper(ls,ans,nums,0);
        return ls;

    }
}