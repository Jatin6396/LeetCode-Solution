class Solution {
    class Pair{
        int i;
        int score;
        Pair(int index,int scores){
            i=index;
            score=scores;
        }
    }
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->b.score-a.score);

        for(int i=0;i<score.length;i++){
            pq.add(new Pair(i,score[i]));
        }

        String[] res=new String[score.length];
        int cnt=1;
        String[] ans={"Gold Medal","Silver Medal","Bronze Medal"};


        while(!pq.isEmpty()){
            Pair p=pq.poll();
            if(cnt<=3){
                res[p.i]=ans[cnt-1];
            }
            else{
                res[p.i]=String.valueOf(cnt);

            }
            cnt++;

        }
        return res;
        
    }
}