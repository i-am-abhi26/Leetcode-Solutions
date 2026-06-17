class Solution {
    public int conquer(int nums[],int left,int mid,int right){
        int i=left,j=mid+1,k=0,c=0;
        int b[]=new int[right-left+1];
        while(i<=mid && j<=right){
            if((long)nums[i]<=(long)2*nums[j]){
                i++;
            }
            else{
                c+=mid-i+1;
                j++;
            }
        }
        i=left;
        j=mid+1;
        while(i<=mid && j<=right){
            if(nums[i]<=nums[j]){
                b[k++]=nums[i++];
            }
            else{
                b[k++]=nums[j++];
            }
        }
        while(i<=mid){
            b[k++]=nums[i++];
        }
        while(j<=right){
            b[k++]=nums[j++];
        }
        for(int l=left;l<=right;l++){
            nums[l]=b[l-left];
        }
        return c;
    }
    public int divide(int nums[],int left,int right){
        int n=nums.length;
        int c=0;
        if(left>=right){
            return 0;
        }
        int mid=left+(right-left)/2;
        c+=divide(nums,left,mid);
        c+=divide(nums,mid+1,right);
        c+=conquer(nums,left,mid,right);
        return c;
    }
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int count=divide(nums,0,n-1);
        return count;
    }
}
