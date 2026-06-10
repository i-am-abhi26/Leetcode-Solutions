class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,s=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s+=nums[i];
            if(maxSum<s){
                maxSum=s;
            }
            if(s<0){
                s=0;
                continue;
            }
        }
        return maxSum;
    }
}
