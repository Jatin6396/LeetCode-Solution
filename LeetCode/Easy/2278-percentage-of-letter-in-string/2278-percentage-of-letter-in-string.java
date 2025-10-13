class Solution {
    public int percentageLetter(String s, char letter) {
       int cnt=0;

        for(char ch:s.toCharArray()){
           if(ch==letter)cnt++;
        }

        return (int)Math.ceil(cnt*100/s.length());
    }
}