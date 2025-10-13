class Solution {
    public static void helper(List<String> ls,String res,int j,String s){
        if(res.length()==s.length()){
            ls.add(res);
            return;
        }

        for(int i=0;i<s.length();i++){
           if (res.indexOf(s.charAt(i)) != -1) continue;
            helper(ls,res+s.charAt(i),j+1,s);
        }
    }
    public boolean checkInclusion(String s1, String s2) {
        List<String> ls =new ArrayList<>();
        helper(ls,"",0,s1);
        for(String str:ls){
           if(s2.contains(str)) return true;
        }
        return false;
    }
}