class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length>nums1.length){
           merge(nums2,n,nums1,m);
        }
        int[] arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[i+m]=nums2[i];
        }
       for(int i=0;i<arr.length;i++){
        nums1[i]=arr[i];
       }
       Arrays.sort(nums1);
    }
}