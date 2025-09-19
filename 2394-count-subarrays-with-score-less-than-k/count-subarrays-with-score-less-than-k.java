class Solution {
    public long countSubarrays(int[] nums, long k) {
         long cnt=0;
        int start=0,end=0;
        int n=nums.length;
        long sum=0;
        while(end<n){
            sum=((sum+nums[end]));
            while(sum*(end-start+1)>=k && start<=end){
                sum-=nums[start];
                start++;
            }
            cnt+=end-start+1;
            end++;


        }
        return cnt;
    }
}