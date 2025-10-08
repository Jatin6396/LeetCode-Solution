class Solution {

    public static int area(int l,int r,int[] height){
        return (r-l)*Math.min(height[l],height[r]);
    }
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int ans=0;

        while(l<r){
            ans=Math.max(ans,area(l,r,height));

            if(height[l]<height[r]) l++;
            else{
                r--;

            }

        }
        return ans;
        
    }
}