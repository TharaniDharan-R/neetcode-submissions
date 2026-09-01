class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
        StringBuilder sb= new StringBuilder();
            String str="";
           for(int j=0;j<n;j++){
            if(ch[j]!=s.charAt(i)){
                str+=ch[j];
                sb.append(s.charAt(j));
            }
           } 
           System.out.println(sb);
           if(str.equals(sb.reverse().toString())){
            return true;
           }
        }
        return false;
    }
}