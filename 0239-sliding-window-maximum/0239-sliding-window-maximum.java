class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q=new LinkedList<>();
        int[] arr=new int[nums.length-k+1];
        int index=0;


        for(int i=0;i<nums.length;i++){

            while(!q.isEmpty() && q.peekFirst()<i-k+1){
                q.pollFirst();
            }


            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }


        q.offerLast(i);

        if(i>=k-1){
            arr[index++]=nums[q.peekFirst()];
        }


        }

        return arr;
    }
}