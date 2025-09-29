class Solution {
    public int maxVowels(String s, int k) {
       char[] chara=s.toCharArray();
       int cnt=0;

       for(int i=0;i<k;i++){
        char ch=chara[i];
        if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
            cnt++;
        }
       }


       int max=cnt;
       int j=0;

       for(int i=k;i<s.length();i++){
        char ch=chara[i];
        char cha=chara[j];
        j++;
        if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
            cnt++;
        }
        if(cha=='a'|| cha=='e' || cha=='i'|| cha=='o'|| cha=='u'){
            cnt--;
        }
        max=Math.max(max,cnt);


       }
       return max;
    }
}