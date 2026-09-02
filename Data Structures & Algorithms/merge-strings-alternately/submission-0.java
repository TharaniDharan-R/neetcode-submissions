class Solution {
    public String mergeAlternately(String w1, String w2) {
        // int right=0;
        // int l=0;
        // int left=0;
        // if(word1.length()>word2.length()){
        //     right=word1.length();
        //     l=word2.length();
        // }
        // else{
        // right=word2.length();
        // l=word1.length();
        // }
        // String s="";
        // while(left<right){
        //     s+=word1.charAt(left);
        //     if(left<l){
        //         s+=word2.charAt(left);
        //     }
        //     left++;
        // }
        // return s;
          int l=0;
          int r=0;
          int len;
        String s="";
        if(w1.length()>w2.length()){
            len=w1.length();
        }
            else
            len=w2.length();
        while(len>0){
            if(l<w1.length()){
                s+=w1.charAt(l++);
            }
            if(r<w2.length()){
                s+=w2.charAt(r++);
            }
            len--;
        }
        return s;
    
    }
}