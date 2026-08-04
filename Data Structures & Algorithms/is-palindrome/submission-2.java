class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String a[]=s.split("[ :,!@#$%^&*()_+'.?]");
        StringBuilder sb= new StringBuilder();
        String ans="";
        for(int i=0;i<a.length;i++){
            sb.append(a[i]);
            ans+=a[i];
        }
        
        if(ans.equals(sb.reverse().toString()))
        return true;
        return false;
    }
}
