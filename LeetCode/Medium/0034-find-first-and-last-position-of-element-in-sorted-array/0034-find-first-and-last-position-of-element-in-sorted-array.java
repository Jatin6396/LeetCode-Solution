class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];

        arr[0]=focc(nums,target);
        arr[1]=locc(nums,target);
        return arr;
        
    }

     public static int locc(int[]nums,int target){
        int ans=-1;

        int start=0;
        int end=nums.length-1;

        while(start<=end){
           int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int focc(int[]nums,int target){
        int ans=-1;

        int start=0;
        int end=nums.length;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}