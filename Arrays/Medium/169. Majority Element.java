class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, el = nums[0], c = 0, n = nums.length;
        //using moore's voting algo
        for (int i = 0; i < n; i++) {
            if (c == 0) {
                c = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                c++;
            } else {
                c--;
            }
        }
        //since the majority el always exist we are not checking
        return el;
    }
}
