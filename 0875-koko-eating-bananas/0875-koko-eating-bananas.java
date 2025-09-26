class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=-1;
        int i=1;
        int j=0;
        for(int k=0;k<piles.length;k++){
            j=Math.max(j,piles[k]);
        }

        while(i<=j){
            int mid=i+(j-i)/2;
            if(valid(piles,mid,h)){
                ans=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }


    public static boolean valid(int[] piles,int mid,int k){
        int sum=0;

        for(int i=0;i<piles.length;i++){
             sum+=piles[i]/mid;
            if(piles[i]%mid!=0) sum++;
            if(sum>k) return false;



        }
        return true;
    }
}