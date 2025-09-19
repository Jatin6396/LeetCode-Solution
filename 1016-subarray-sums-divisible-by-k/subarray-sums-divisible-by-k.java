class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        int sum=0;
        int cnt=0;

        for(int i=0;i<nums.length;i++ ){
            sum=((sum+nums[i])%k+k)%k;
            cnt+=map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);


            
        }

        return cnt;
        
    }
}