class Solution {
    public int[][] merge(int[][] interval) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(interval,(a,b)->a[0]-b[0]);

        for(int i=1;i<interval.length;i++){
            int[] prev=interval[i-1];
            if(prev[1]>=interval[i][0]){
               int one=Math.min(prev[0],interval[i][0]);
               int two=Math.max(prev[1],interval[i][1]);
               res.add(new int[]{one,two});
            }
            else{
                res.add(interval[i]);
            }

        }

        return res.toArray(new int[res.size()][2]);
    }
}