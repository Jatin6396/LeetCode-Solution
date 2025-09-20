class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) max=Math.max(max,nums[i]);

        long cnt=0,total=0;
        int start=0,end=0,n=nums.length;

        while(end<n){
            if(nums[end]==max) cnt++;

            while(cnt==k){
                total+=n-end;
                if(nums[start]==max) cnt--; 
                start++;
                
            }
            end++;
        }
        return total;
        
    }
}