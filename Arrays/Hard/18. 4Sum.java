class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        if(n<4){
            return list;
        }
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1,l=n-1;
                while(k<l){
                    List<Integer> temp=new ArrayList<>();
                    long s=(long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(s==target){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        k++;
                        l--;
                        while(k<n && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(l>=0 && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    else if(s<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                    if(temp.size()!=0){
                        list.add(temp);
                    }
                }
            }
        }
        return list;
    }
}
