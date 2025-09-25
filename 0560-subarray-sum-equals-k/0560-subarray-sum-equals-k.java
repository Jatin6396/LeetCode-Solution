class Solution {
    public int subarraySum(int[] arr, int k) {
         HashMap<Integer,Integer>m=new HashMap<>();
        int sum=0;
        //add one zero
        m.put(0,1);
        int cnt=0;
        
        for(int i=0;i<arr.length;i++){
            // prefix sum
            sum+=arr[i];
            if(m.containsKey(sum-k)){
                int val=m.get(sum-k);
                cnt+=val;
                
            }
            m.put(sum,m.getOrDefault(sum,0)+1);
            
            
        }
        
        return cnt;
        
    }
}