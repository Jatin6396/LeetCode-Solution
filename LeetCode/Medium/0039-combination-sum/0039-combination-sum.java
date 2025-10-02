class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        helper(candidates,target,res,ans,0);
        return res;
    }

    public static void helper(int [] nums,int target,List<List<Integer>> res,List<Integer> ans,int idx){
        if(idx==nums.length){
            if(0==target){
                res.add(new ArrayList<>(ans));
            }
            return;
        }

        if(nums[idx]<=target){
            ans.add(nums[idx]);
        helper(nums,target-nums[idx],res,ans,idx);
        ans.remove(ans.size()-1);
        }
        helper(nums,target,res,ans,idx+1);
    }
}