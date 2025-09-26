class Solution {
    public int splitArray(int[] arr, int k) {
        int n=arr.length;
        
        if(n<k){
           return -1;
       }
        int start=0;
        int end=0;
        int ans=-1;
        
        
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(isValid(arr,mid,k)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
        
    }
     public static boolean isValid(int[] arr,int mid,int k){
        int cnt=1;
        int page=0;
        
        for(int i=0;i<arr.length;i++){
            page+=arr[i];
            
            if(page>mid) {
                cnt++;
                page=arr[i];
            }
            
            //if(cnt>k) return false;
        }
        return cnt<=k;
    }
}