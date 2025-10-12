class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int[] res=new int[tem.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<tem.length;i++){
           
            while(!stack.isEmpty()  && tem[stack.peek()]<tem[i]){
                int prev=stack.pop();
                res[prev]=i-prev;

            }
            stack.push(i);
            
        }
        return res;
    }
}