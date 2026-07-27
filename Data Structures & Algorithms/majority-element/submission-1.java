class Solution {
    public int majorityElement(int[] nums) {
        int max=nums.length/2;
        int ans=0;
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            if(hm.get(i)>max){
            ans=i;
            break;
            }
        }
        return ans;
    }
}