class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i:gifts){
            pq.add(i);
        }

        while(k-->0){
            int gift=pq.poll();
            pq.add((int)Math.sqrt(gift));
        }

        long sum=0;
        for(int i:pq){
            System.out.println(i);
            sum+=i;
        }
        return sum;
    }
}