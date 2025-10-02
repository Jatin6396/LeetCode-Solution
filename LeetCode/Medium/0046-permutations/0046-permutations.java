class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ls =new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        boolean[] visited=new  boolean[nums.length];
        helper(ls,ans,visited,nums,0);
        return ls;
    }

    public static void helper(List<List<Integer>>ls,List<Integer> ans,boolean[] visited,int[] arr,int j){
        if(j==arr.length){
            ls.add(new ArrayList<>(ans));
            return;

        }

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                visited[i]=true;
                ans.add(arr[i]);
                helper(ls,ans,visited,arr,j+1);
                visited[i]=false;
                ans.remove(ans.size()-1);
                
            }
        }
    }
}