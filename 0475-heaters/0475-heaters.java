class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int start=0;
        int end=Integer.MAX_VALUE;
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(isValid(houses,heaters,mid)){
                ans=mid;
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }


    public static boolean isValid(int[] houses, int[] heaters, int radius) {
        int i = 0, j = 0;
        int n = houses.length, m = heaters.length;

        while (i < n && j < m) {
            int left = heaters[j] - radius;
            int right = heaters[j] + radius;

            while (i < n && houses[i] >= left && houses[i] <= right) {
                i++;
            }
            j++;
        }

        return i == n;
    }
}

