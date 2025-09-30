class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int i=1;
        int j=pos[pos.length-1]-pos[0];
        int ans=-1;

        while(i<=j){
            int mid=i+(j-i)/2;

            if(isValid(pos,mid,m)){
                ans=mid;
                i=mid+1;

            }
            else{
                j=mid-1;
            }
        }
        return ans;
        
    }

    public static boolean isValid(int[] arr,int mid,int k){
        int cnt=1;
        int prev=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev>=mid) {
                cnt++;
                prev=arr[i];
            }
        }

        return cnt>=k;
    }
}