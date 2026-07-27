class Solution {
    public void rotate(int[] nums, int k) {
         int l=nums.length;
        k=k%l;
        int ans[]=new int[l];
        for(int i=0;i<nums.length;i++){
            ans[(i+k)%l]=nums[i];
        }
        for(int i=0;i<l;i++){
            nums[i]=ans[i];
        }
        
    }
}