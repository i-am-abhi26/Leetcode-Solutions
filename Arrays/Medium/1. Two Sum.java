class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(map.containsKey(target-x)){
                a[0]=map.get(target-x);
                a[1]=i;
                return a;
            }
            map.put(x,i);
        }
        return a;
    }
}
