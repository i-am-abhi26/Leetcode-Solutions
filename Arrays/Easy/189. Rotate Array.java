class Solution {
    public void reverse(int[] nums, int si, int ei) {
        while (si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;

        k = k % n;
        if (k == 0) return;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
}
