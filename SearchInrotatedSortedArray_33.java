public class SearchInrotatedSortedArray_33 {

    public int search(int[] nums, int target) {
        int result = nums[0];
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target == nums[middle]) {
                return middle;
            }
            // 判断middle是在左侧还是在右侧
            if (nums[left] <= nums[middle]) {
                // 在left
                if (target > nums[middle] || target < nums[left]) {
                    // middle左边的都不用管了，因为目标比在左边升序的数组middle还要大，所以去找右边
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (target < nums[middle] || target > nums[right]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}
