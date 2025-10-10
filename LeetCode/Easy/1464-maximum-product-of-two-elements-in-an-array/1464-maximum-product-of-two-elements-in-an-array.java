class Solution {
    public int maxProduct(int[] nums) {
        

      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
      for(int i:nums){
        pq.add(i);
      }
      int first=pq.poll()-1;
      int second=pq.poll()-1;
      return first*second;
    }
}