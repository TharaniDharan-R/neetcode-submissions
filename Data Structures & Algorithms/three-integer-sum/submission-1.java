class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ls= new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            int t=-nums[i];
            while(l<r){
                if(nums[l]+nums[r]==t){
                    ls.add(Arrays.asList(nums[i],nums[l],nums[r]));
                while(l<r && nums[l]==nums[l+1]){
                    l++;
                }
                while(l<r && nums[r]==nums[r-1]){
                    r--;
                }

                l++;
                r--;
                }
                else if(nums[l]+nums[r]<t){
                    l++;
                }
                else{
                    r--;
                }
            }

        }
            return ls;
    }
}
