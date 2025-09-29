class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            c+=nums[i];
            max=Math.max(max,c);
            if(c<0){ c=0;}
      
        } 
        return max;
    }
}