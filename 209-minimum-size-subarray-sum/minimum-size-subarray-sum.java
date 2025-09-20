class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int min=Integer.MAX_VALUE;
        int start=0,end=0;
        int n=nums.length-1;
        int sum=0;
        while(end<=n){
            sum+=nums[end];
            while(sum>=k && start<=end){
                min=Math.min(min,end-start+1);
                sum-=nums[start++];
            }
            end++;

        }
        return min==Integer.MAX_VALUE?0:min;
    }
}