class Solution {
    public boolean isPerfectSquare(int num) {
        long i=1;
        long j=num;
        boolean ans=false;
        while(i<=j){
            long mid=i+(j-i)/2;
            if(mid*mid==num){
                ans=true;
                break;
            }
            else if(mid*mid<num){
                i=mid+1;

            }
            else{
                j=mid-1;
            }
        }
        return ans;
        
    }
}