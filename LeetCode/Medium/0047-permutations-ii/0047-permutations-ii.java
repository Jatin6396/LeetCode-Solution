class Solution {
    public static void helper(int[] nums,HashSet<List<Integer>> res2, List<Integer> ans,int index){
        if(index==nums.length){
            res2.add(new ArrayList<>(ans));
        }
        for(int i=index;i<nums.length;i++){
            ans.add(nums[i]);
            swap(nums,i,index);
            helper(nums,res2,ans,index+1);
            swap(nums,index,i);
            ans.remove(ans.size()-1);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       
        HashSet<List<Integer>> res2=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        helper(nums,res2,ans,0);
         List<List<Integer>> res=new ArrayList<>(res2);
        return res;
    }
}