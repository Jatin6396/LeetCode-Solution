class Solution {
     public void Helper(int[] arr,int i,List<Integer> list,List<List<Integer>> ans){
      if(i==arr.length){
          List<Integer> l=new ArrayList<>(list);
              ans.add(l);
          return;
      }
      
      Helper(arr,i+1,list,ans);
      list.add(arr[i]);
      Helper(arr,i+1,list,ans);
      list.remove(list.size()-1);
      
  }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Helper(nums,0,new ArrayList<>(),result);
        return result;



    }
}