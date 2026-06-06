class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int j=0;
        ans[j++]=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                ans[j++]=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i<j){
                nums[i]=ans[i];
            }
            else{
                nums[i]=0;
            }
        }
        return j;
    }
}
