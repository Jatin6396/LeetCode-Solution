class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
      PriorityQueue<Integer> q = new PriorityQueue<>();


       for(int i=0;i<k;i++){
        q.add(nums[i]);

       }

       for(int i=k;i<n;i++){
        if(nums[i]>q.peek()){
            q.poll();
            q.add(nums[i]);

        }
       }

       return q.peek();
    }
}