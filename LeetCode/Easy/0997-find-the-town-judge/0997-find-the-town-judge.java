class Solution {
    public int findJudge(int n, int[][] trust) {
       HashSet<Integer> judge=new HashSet<>();
       HashSet<Integer> people=new HashSet<>();
       int[] trustCount = new int[n + 1]; 

       for(int i=0;i<trust.length;i++){
       judge.add(trust[i][1]);
       people.add(trust[i][0]);
       trustCount[trust[i][1]]++; 
       }

       for(int peo:people){
       
            judge.remove(peo);
       }

      if(judge.size()==0) return -1;
      int ans=0;
      for(int i:judge){
        if(trustCount[i]==n-1)
        return i;
      }
      return -1;
        
    }
}