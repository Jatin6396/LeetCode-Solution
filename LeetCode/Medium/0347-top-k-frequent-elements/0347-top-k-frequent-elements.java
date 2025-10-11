class Solution {
   
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       int arr[]=new int[k];


       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }


       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
       for(int key : map.keySet()){
            pq.add(key);
        }

        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
    }
}