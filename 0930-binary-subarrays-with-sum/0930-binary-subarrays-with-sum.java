class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            cnt+=map.getOrDefault(sum-goal,0);


            map.put(sum,map.getOrDefault(nums[i],0)+1);
        }
        return cnt;
    }
}