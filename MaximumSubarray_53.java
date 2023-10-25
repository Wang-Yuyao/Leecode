public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;
        for (int index = 0; index < nums.length; index++) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum = curSum + nums[index];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
