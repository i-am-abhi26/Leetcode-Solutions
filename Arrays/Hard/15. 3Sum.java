class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=n-1;
            while(j<k){
                List<Integer> temp=new ArrayList<>();
                int s=nums[i]+nums[j]+nums[k];
                if(s==0){
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    while(k>0 && nums[k]==nums[k-1]){
                        k--;
                    }
                    k--;
                    while(j<n && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else if(s<0){
                    j++;
                }
                else{
                    k--;
                }
                if(temp.size()!=0){
                    list.add(temp);
                }
            }
        }
        return list;
    }
}
