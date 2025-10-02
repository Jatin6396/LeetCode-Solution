class Solution {
    public static void helper(List<List<Integer>> res,int[] nums,int idx,List<Integer> ans){
   if(idx==nums.length){
//    for(int i=0;i<nums.length;i++){
//     ans.add(nums[i]);
//    }
   res.add(new ArrayList<>(ans));
  }

    for(int i=idx;i<nums.length;i++){
        swap(nums,i,idx);
        ans.add(nums[idx]);
        helper(res,nums,idx+1,ans);
        ans.remove(ans.size()-1);
        swap(nums,i,idx);
    }

    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
        helper(res,nums,0,ans);
        return res;
    }
}