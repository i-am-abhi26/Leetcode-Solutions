class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,c=0,maxc=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                if(maxc<c){
                    maxc=c;
                }
                c=0;
            }
        }
        if(maxc<c){
            maxc=c;
        }
        return maxc;
    }
}
