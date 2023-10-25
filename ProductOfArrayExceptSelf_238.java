public class ProductOfArrayExceptSelf_238 {
     public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = 1;
        int [] output = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            output[index] = prefix;
            prefix = prefix * nums[index];
        }
        for (int index = nums.length-1; index >= 0; index--) {
            output[index] = postfix * output[index];
            postfix = postfix * output[index];
        }
        return output;
    }
}
