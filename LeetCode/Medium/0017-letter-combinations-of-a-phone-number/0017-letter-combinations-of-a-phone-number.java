class Solution {

    public static void helper(List<String> ls,String digits,int i,String[] map,String res){

        if(digits.length()==res.length()){ 
            ls.add(res);
        return;
        }

        int n=digits.charAt(i)-'0';

        for(int j=0;j<map[n].length();j++){
            helper(ls,digits,i+1,map,res+map[n].charAt(j));
        }



    }
    public List<String> letterCombinations(String digits) {
        List<String> ls=new ArrayList<>();
        if (digits == null || digits.length() == 0) return ls;
    


        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        helper(ls,digits,0,map,"");

        return ls;
    }
}