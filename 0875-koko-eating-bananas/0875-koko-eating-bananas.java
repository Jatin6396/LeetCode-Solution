class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            end=Math.max(piles[i],end);
        }
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(finisheating(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            

        }
        return ans;
    }
    public static boolean finisheating(int[] piles,int mid, int h){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=piles[i]/mid;
            if(piles[i]%mid!=0) sum++;
            if(sum>h) return false;
        }
        return true;
    }
}