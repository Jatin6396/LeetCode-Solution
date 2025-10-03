class Solution {
    public int search(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }else if(arr[i]<=arr[mid]){
                if(target>=arr[i]&& target<arr[mid]){
                    j=mid-1;
                }
                else {
                    i=mid+1;
                }
            }else{
                if(target<=arr[j]&& target>arr[mid]){
                    
                    i=mid+1;
                }
                else {
                    j=mid-1;
                }

            }

        } return ans;
    }
}