class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int len=0,start=0,end=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(end<nums.length){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);

            while(map.get(nums[end])>k){
                map.put(nums[start], map.get(nums[start++]) - 1);
                
            }

            len=Math.max(len,end-start+1);
            end++;

        }
        return len;
    }
}