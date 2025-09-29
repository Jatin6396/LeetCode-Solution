class Solution {
    public int numOfSubarrays(int[] arr, int k, int hold) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int cnt=0;
        if((sum/k)>=hold){
                cnt++;
        }
        int j=0;
        for(int i=k;i<arr.length;i++){
            
            sum+=arr[i]-arr[j];
            j++;
            if((sum/k)>=hold){
                cnt++;
            }

        }
        return cnt;
    }
}