class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int max=1;
        int c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]){
                c++;
            }
            else if(nums[i] != nums[i+1])
            c=1;
            max= Math.max(max,c);
        }
        return max;
    }
}
