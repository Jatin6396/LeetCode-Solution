class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hs.add(nums[i])){
                ls.add(nums[i]);
            }
        }

        for(int i=0;i<ls.size();i++){
            nums[i]=ls.get(i);
        }
        return ls.size();
    }
}