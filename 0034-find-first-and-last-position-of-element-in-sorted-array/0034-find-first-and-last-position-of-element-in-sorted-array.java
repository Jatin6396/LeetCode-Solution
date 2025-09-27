class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f_occ=first(nums,target);
        int l_occ=last(nums,target);
        int arr[]=new int[2];
        arr[0]=f_occ;
        arr[1]=l_occ;
        return arr;
    }
    public  int first(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;

            }else if(nums[mid]<target){
                start=mid+1;

              }
             else{
                end=mid-1;
            }
        }return ans;
    }
    public  int last(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;

            }else if(nums[mid]<target){
                start=mid+1;

              }
             else{
                end=mid-1;
            }
        }return ans;
    }
}