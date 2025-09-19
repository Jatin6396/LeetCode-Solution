class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt=0;
        int start=0,end=0;
        int n=nums.length-1;
        int product=1;
        while(end<=n){
            product*=nums[end];
            while(product>=k && start<=end){
                product/=nums[start];
                start++;
            }
            cnt+=(end-start)+1;
            end++;


        }
        return cnt;
        
    }
}