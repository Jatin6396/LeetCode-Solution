class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=1;
    
        int end=0;
        for(int i=0;i<weights.length;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(isShipment(weights,mid,days)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }



        }

        return ans;
    }


    public  boolean isShipment(int[] arr,int mid,int days){
        int currday=1;
        int cap=0;

        for(int i=0;i<arr.length;i++){
            cap+=arr[i];

            if(cap>mid){
                currday++;
                cap=arr[i];
            }
            
        }
        return currday<=days;
    }
}