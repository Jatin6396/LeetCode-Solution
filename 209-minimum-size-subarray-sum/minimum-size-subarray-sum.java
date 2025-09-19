class Solution {
    public int minSubArrayLen(int x, int[] arr) {
         int start=0,end=0;
        int cnt=0;
        int n=arr.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(end<n){
            sum+=arr[end];
            while(sum>=x){
                min=Math.min(min,end-start+1);
                sum-=arr[start];
                start++;
            }
            
            end++;
            
        }
        return (min==Integer.MAX_VALUE)?0:min;
        
    }
}