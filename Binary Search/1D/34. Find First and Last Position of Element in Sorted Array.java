class Solution {
    public int first(int nums[],int target){
        int ans=0;
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(nums[ans]==target){
            return ans;
        }
        else{
            return -1;
        }
    }
    public int last(int nums[],int target){
        int ans=0;
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(nums[ans]==target){
            return ans;
        }
        else{
            return -1;
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=first(nums,target);
        ans[1]=last(nums,target);
        return ans;
    }
}
