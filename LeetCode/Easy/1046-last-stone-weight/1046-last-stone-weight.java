class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);


        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }


        while(pq.size()>1){
            int stone1=pq.poll();
            int stone2=pq.poll();
          
                pq.add(stone1-stone2);
        }
        return pq.peek();
    }
}