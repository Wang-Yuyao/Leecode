public class MaximumProductSubarray_152 {
    public static void main(String[] args) {
         int[] maxAndMin = new int[] { 2, 3, -2 ,4};
        maxProduct(maxAndMin);
    }
    /*
     * 核心思想是追踪最大值Max和最小值Min
     * 依次向后追踪每个数，与最大Max值和最小值Min比较
     * 若比Max值大，就更新Max，同理更新最小值Min（考虑到负数*负数=正数）
     * 最后得出的Max即为最大值
     */
    public static int maxProduct(int[] nums) {
        int res = 0;
        int curMax = 1;
        int curMin = 1;
        for (int n : nums) {
            if (n == 0) {
                curMax = 1;
                curMin = 1;
                continue;
            }
            int temp = curMax * n;
            curMax = Math.max(n * curMax, Math.max(n * curMin, n));
            curMin = Math.min(temp, Math.min(n * curMin, n));
            res = Math.max(res, curMax);
        }
        System.out.println(res);
        return res;
    }
}
