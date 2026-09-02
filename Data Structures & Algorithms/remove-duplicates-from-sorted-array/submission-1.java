class Solution {
    public int removeDuplicates(int[] nums) {
         LinkedHashSet<Integer>hs= new LinkedHashSet<>();
         for(int i:nums){
            hs.add(i);

         }
         int c=0;
         for(int i:hs){
            nums[c++]=i;
         }
         return hs.size();
         
    }
}