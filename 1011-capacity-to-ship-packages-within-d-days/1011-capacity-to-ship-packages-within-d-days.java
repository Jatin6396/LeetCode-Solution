class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int res=-1;
       int start=MAX(weights);
       int end=SUM(weights);
       while(start<=end){
           int mid=start+(end-start)/2;
           if(isShipmentispossible(weights,mid,days)){
               res=mid;
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       return res;
    }
    public static boolean isShipmentispossible(int [] arr,int mid,int days){
        int currday=1;
        int capacity=0;
        for(int i=0;i<arr.length;i++){
            capacity+=arr[i];
            if(capacity>mid){
                currday++;
                capacity=arr[i];
            }
            if(currday>days) return false;
        }return true;
    }
    public static int MAX(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int SUM(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}