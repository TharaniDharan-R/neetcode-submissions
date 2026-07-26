class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm= new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(!hm.containsKey(s)){
                hm.put(s,new ArrayList<>());
            }
            hm.get(s).add(strs[i]);
            
            
        
        }
        List<List<String>>ans=new ArrayList<>();
        for(List<String>list:hm.values()){
            ans.add(list);
        }
        return ans;
    }
}
