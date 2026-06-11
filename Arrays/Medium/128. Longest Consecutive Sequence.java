class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,c=0,maxCount=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }
            else{
                c=1;
                int x=i;
                while(set.contains(x+1)){
                    x+=1;
                    c+=1;
                }
            }
            maxCount=Math.max(c,maxCount);
        }
        return maxCount;
    }
}
