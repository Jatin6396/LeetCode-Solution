class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=(double)sum/k;
        System.out.println(avg);
        double max=avg;
        int index=0;


        for(int i=k;i<nums.length;i++){
            sum=sum-nums[index++]+nums[i];
            avg=(double)sum/k;
            max=Math.max(avg,max);

        }

        return max;
    }
}