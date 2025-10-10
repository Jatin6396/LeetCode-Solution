class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);


        for(int i:amount) pq.add(i);

        int sec=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            if(first>1) pq.add(first-1);
            if(second>1) pq.add(second-1);
            sec++;
        }
        if(pq.size()!=0) sec+=pq.peek();
        return sec;
    }
}