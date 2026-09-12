class Solution {
    public int missingNumber(int[] nums) {

        int oldSum = 0;

        int n = nums.length;

        int sum = (n * (n + 1)) / 2;

        for (int i = 0; i < nums.length; i++) {
            oldSum += nums[i];
        }

        int result = sum - oldSum;

        return result;
    }
}