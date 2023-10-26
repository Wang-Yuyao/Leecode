public class FindMinimumInRotatedSortedArray_153 {
    public int findMin(int[] nums) {
        int result = nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[left] <= nums[middle]) {
                result = Math.min(nums[left], result);
                left = middle + 1;
            } else {
              result = Math.min(result, nums[middle]);
              right = middle - 1;
            }
        }
        return result;
    }
}
